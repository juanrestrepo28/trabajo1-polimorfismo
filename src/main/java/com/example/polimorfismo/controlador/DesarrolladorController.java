package com.example.polimorfismo.controlador;

import com.example.polimorfismo.modelo.AI;
import com.example.polimorfismo.modelo.Codigo;
import com.example.polimorfismo.modelo.DesarrolladorSoftware;
import com.example.polimorfismo.modelo.JuniorDev;
import com.example.polimorfismo.modelo.ResultadoDesarrollador;
import com.example.polimorfismo.modelo.SeniorDev;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador: aquí van las peticiones (tal como se enseñó en clase).
 * NO hay lógica de negocio en el main; todo el flujo se arma aquí y se
 * apoya en las clases del paquete "modelo".
 */
@Controller
public class DesarrolladorController {

    @GetMapping("/")
    public String mostrarDesarrolladores(Model model) {

        // Listas paralelas: cada DesarrolladorSoftware en la posición i
        // fue construido con el Codigo que está en la posición i de "codigos".
        List<DesarrolladorSoftware> desarrolladores = new ArrayList<>();
        List<Codigo> codigos = new ArrayList<>();

        // ---------- 3 objetos SeniorDev ----------
        Codigo c1 = new Codigo("PagoService.java", "Java", 850, "procesar pagos con tarjeta");
        desarrolladores.add(new SeniorDev("Carlos Ramírez", 12, c1));
        codigos.add(c1);

        Codigo c2 = new Codigo("AuthModule.py", "Python", 620, "autenticación de usuarios");
        desarrolladores.add(new SeniorDev("Mariana López", 9, c2));
        codigos.add(c2);

        Codigo c3 = new Codigo("OrderController.cs", "C#", 980, "gestión de pedidos");
        desarrolladores.add(new SeniorDev("Andrés Torres", 15, c3));
        codigos.add(c3);

        // ---------- 3 objetos JuniorDev ----------
        Codigo c4 = new Codigo("Carrito.js", "JavaScript", 210, "carrito de compras");
        desarrolladores.add(new JuniorDev("Laura Gómez", "JavaScript", c4));
        codigos.add(c4);

        Codigo c5 = new Codigo("Inventario.java", "Java", 180, "control de inventario");
        desarrolladores.add(new JuniorDev("Pedro Sánchez", "Java", c5));
        codigos.add(c5);

        Codigo c6 = new Codigo("Login.php", "PHP", 150, "formulario de login");
        desarrolladores.add(new JuniorDev("Sofía Herrera", "PHP", c6));
        codigos.add(c6);

        // ---------- 3 objetos AI ----------
        Codigo c7 = new Codigo("Recomendador.py", "Python", 430, "sistema de recomendaciones");
        desarrolladores.add(new AI("CodeGenAI", "v3.2", c7));
        codigos.add(c7);

        Codigo c8 = new Codigo("Chatbot.java", "Java", 560, "chatbot de soporte");
        desarrolladores.add(new AI("DevBotAI", "v1.8", c8));
        codigos.add(c8);

        Codigo c9 = new Codigo("Reportes.js", "JavaScript", 300, "generación de reportes");
        desarrolladores.add(new AI("AutoCoderAI", "v2.5", c9));
        codigos.add(c9);

        // -------- ITERACIÓN CON POLIMORFISMO (punto 4) --------
        // El tipo de la variable "dev" es la interfaz DesarrolladorSoftware,
        // pero en tiempo de ejecución cada objeto ejecuta SU PROPIA versión
        // de escribir(), depurar() y desplegar(): eso es polimorfismo.
        List<ResultadoDesarrollador> resultados = new ArrayList<>();
        for (int i = 0; i < desarrolladores.size(); i++) {
            DesarrolladorSoftware dev = desarrolladores.get(i);
            Codigo codigo = codigos.get(i);

            String tipo = dev.getClass().getSimpleName();
            String mensajeEscribir = dev.escribir(codigo);
            String mensajeDepurar = dev.depurar(codigo);
            String mensajeDesplegar = dev.desplegar(codigo);

            resultados.add(new ResultadoDesarrollador(
                    tipo, codigo.getNombreArchivo(), mensajeEscribir, mensajeDepurar, mensajeDesplegar));
        }

        model.addAttribute("resultados", resultados);
        model.addAttribute("totalObjetos", resultados.size());

        return "desarrolladores"; // busca templates/desarrolladores.html
    }
}

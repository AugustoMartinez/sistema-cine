import cine.cinelugar.Cine;
import cine.user.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static cine.user.GestionUsuario.actualizar;
import static cine.user.GestionUsuario.getResultados;

public class Main {
    public static void main(String[] args) {
        Cine cine=new Cine("Alvarado 3800", "CinemaCenter");
        getResultados();
        actualizar(new Cliente("algp@gmail.com","21312311","Al","go"));
        getResultados();

    }
}
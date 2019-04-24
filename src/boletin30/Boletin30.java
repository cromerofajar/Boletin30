package boletin30;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Boletin30 {

    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> selec=new ArrayList<>();
        SeleccionFutbol futbolista=new Futbolista(3,"delantero",1,20,"Jose","Perez Blanco");
        SeleccionFutbol entrenador=new Entrenador(1,2,38,"Pepe","Cojera Leve");
        SeleccionFutbol masajista=new Masajista("fisioterapeuta",6,3,32,"Clara","Martinez Martinez");
        SeleccionFutbol seleccionador=new Seleccionador(4,40,"Marcos","Perez Piedra");
        futbolista.concentrarse();
        entrenador.concentrarse();
        masajista.concentrarse();
        seleccionador.concentrarse();
        selec.add(futbolista);
        selec.add(entrenador);
        selec.add(masajista);
        selec.add(seleccionador);
        for(SeleccionFutbol f: selec){
            JOptionPane.showMessageDialog(null,f);
        }
    }
    
}

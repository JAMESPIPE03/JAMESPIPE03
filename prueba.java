
package diseñosoftware;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author James Olarte cód 240220212016
 */
public class DiseñoSoftware extends JFrame {

    JLabel etiquete1;
    JLabel etiqueta2;
    JLabel etiquetaResultado;

    JTextField text1;
    JTextField texto2;
    JTextField textoResultado;

    public DiseñoSoftware() {
        setLayout(null);
        setResizable(false);
        setBounds(10, 10, 500, 300);
        setTitle("Ejercicio GIT");
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
       new DiseñoSoftware();
    }

}

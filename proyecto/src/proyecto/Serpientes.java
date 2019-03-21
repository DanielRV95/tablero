package proyecto;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.applet.*;


public class Serpientes extends JFrame implements Juego {
    
    //Variables
    int numdado = 0, continua;
    int numero1 = 0, numero2 = 0, numero;
    int var[];
    JFrame jfrm,jfrm1, jfrm3;
    JLabel botinstru;
    JButton jbtnTirar,jbtnInstru,jbtnGirar;
    JLabel dado,fondo;
    JLabel jlabfi[] = new JLabel[56];
    JLabel camino[] = new JLabel[37];   
    //Declaracion de arreglo de imagenes para establecer la figura principal 
    Icon img [] ={ new ImageIcon("principal.png")};
    JLabel jlabfondo = new JLabel(img[0]);
    Icon imgo[] = {new ImageIcon("pantalla.jpg"),};  
    //Declaracion del arreglo donde suben y bajan de posiscion la variable
    int[] trampa = {0, 0, 0, 0, 0, 0, 0, 0, +9, 0, 0, 0, -9, 0, +8, 0, 0, 0, -4, 0, 0, +8, 0, 0, 0, 0, -3, 0, 0, 0, 0, +3, 0, -13, 0};
   
    // Declarando los contenedores
    Container contenedor,contenedor1, cont3;
    public Serpientes() {
        jfrm = new JFrame("Juego");
        contenedor = jfrm.getContentPane();
        contenedor.setLayout(null);
        jfrm.setSize(1000, 700);
        jfrm.setResizable(false);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jbtnTirar = new JButton("Lanzar dados");
        jbtnTirar.setBounds(650, 100, 120, 27);
        contenedor.setSize(1000,700);
        contenedor.add(jbtnTirar);
        
        jfrm1 = new JFrame("Instrucciones");
        contenedor1 = jfrm1.getContentPane();
        contenedor1.setLayout(null);
        jfrm1.setSize(500, 310);
        jfrm1.setResizable(false);
        jbtnInstru = new JButton("Instrucciones");
        jbtnInstru.setBounds(800, 100, 130, 27);
        contenedor.add(jbtnInstru);        
              
        // Icono de la ventana, ubicación y visualización del frame
        jfrm.setLocationRelativeTo(null);
        jfrm.setVisible(true);
        jfrm1.setLocationRelativeTo(null);
        jfrm1.setVisible(false);
        jfrm.setVisible(false);
        jfrm.setVisible(true);
        //JLabel    
        dado = new JLabel();
        dado.setBounds(65, 100, 230, 230);
        contenedor.add(dado);
        botinstru=new JLabel();
        botinstru.setBounds(50,25,407,251);
        contenedor1.add(botinstru);
       
        for (int i = 0; i < 37; i++) {
            camino[i] = new JLabel();
            camino[i].setFont(new Font("Comic Sans MS", Font.BOLD, 16));
            contenedor.add(camino[i]);
        }

        camino[0].setBounds(60, 530, 50, 50);
        camino[1].setBounds(120, 530, 50, 50);
        camino[2].setBounds(180, 530, 50, 50);
        camino[3].setBounds(240, 530, 50, 50);
        camino[4].setBounds(300, 530, 50, 50);
        camino[5].setBounds(360, 530, 50, 50);
        camino[6].setBounds(420, 530, 50, 50);
        camino[7].setBounds(480, 530, 50, 50);
        camino[8].setBounds(480, 450, 50, 50);
        camino[9].setBounds(480, 370, 50, 50);
        camino[10].setBounds(420, 370, 50, 50);
        camino[11].setBounds(360, 370, 50, 50);
        camino[12].setBounds(300, 370, 50, 50);
        camino[13].setBounds(240, 370, 50, 50);
        camino[14].setBounds(180, 370, 50, 50);
        camino[15].setBounds(120, 370, 50, 50);
        camino[16].setBounds(60, 370, 50, 50);
        camino[17].setBounds(60, 290, 50, 50);
        camino[18].setBounds(60, 210, 50, 50);
        camino[19].setBounds(120, 210, 50, 50);
        camino[20].setBounds(180, 210, 50, 50);
        camino[21].setBounds(240, 210, 50, 50);
        camino[22].setBounds(300, 210, 50, 50);
        camino[23].setBounds(360, 210, 50, 50);
        camino[24].setBounds(420, 210, 50, 50);
        camino[25].setBounds(490, 210, 50, 50);
        camino[26].setBounds(490, 130, 50, 50);
        camino[27].setBounds(490, 50, 50, 50);
        camino[28].setBounds(420, 50, 50, 50);
        camino[29].setBounds(360, 50, 50, 50);
        camino[30].setBounds(300, 50, 50, 50);
        camino[31].setBounds(240, 50, 50, 50);
        camino[32].setBounds(180, 50, 50, 50);
        camino[33].setBounds(120, 50, 50, 50);
        camino[34].setBounds(60, 50, 50, 50);
        
              
        camino[0].setIcon(new ImageIcon(getClass().getResource("numero1.jpg")));
        camino[1].setIcon(new ImageIcon(getClass().getResource("numero2.jpg")));
        camino[2].setIcon(new ImageIcon(getClass().getResource("numero3.jpg")));
        camino[3].setIcon(new ImageIcon(getClass().getResource("numero4.jpg")));
        /*camino[4].setIcon(new ImageIcon(getClass().getResource("numero5.jpg")));
        camino[5].setIcon(new ImageIcon(getClass().getResource("numero6.jpg")));
        camino[6].setIcon(new ImageIcon(getClass().getResource("numero7.jpg")));
        camino[7].setIcon(new ImageIcon(getClass().getResource("numero8.jpg")));
        camino[8].setIcon(new ImageIcon(getClass().getResource("numero9.jpg")));
        camino[9].setIcon(new ImageIcon(getClass().getResource("numero10.jpg")));
        camino[10].setIcon(new ImageIcon(getClass().getResource("numero11.jpg")));
        camino[11].setIcon(new ImageIcon(getClass().getResource("numero12.jpg")));
        camino[12].setIcon(new ImageIcon(getClass().getResource("numero13.jpg")));
        camino[13].setIcon(new ImageIcon(getClass().getResource("numero14.jpg")));
        camino[14].setIcon(new ImageIcon(getClass().getResource("numero15.jpg")));
        camino[15].setIcon(new ImageIcon(getClass().getResource("numero16.jpg")));
        camino[16].setIcon(new ImageIcon(getClass().getResource("numero17.jpg")));
        camino[17].setIcon(new ImageIcon(getClass().getResource("numero18.jpg")));
        camino[18].setIcon(new ImageIcon(getClass().getResource("numero19.jpg")));
        camino[19].setIcon(new ImageIcon(getClass().getResource("numero20.jpg")));
        camino[20].setIcon(new ImageIcon(getClass().getResource("numero21.jpg")));
        camino[21].setIcon(new ImageIcon(getClass().getResource("numero22.jpg")));
        camino[22].setIcon(new ImageIcon(getClass().getResource("numero23.jpg")));
        camino[23].setIcon(new ImageIcon(getClass().getResource("numero24.jpg")));
        camino[24].setIcon(new ImageIcon(getClass().getResource("numero25.jpg")));
        camino[25].setIcon(new ImageIcon(getClass().getResource("numero26.jpg")));
        camino[26].setIcon(new ImageIcon(getClass().getResource("numero27.jpg")));
        camino[27].setIcon(new ImageIcon(getClass().getResource("numero28.jpg")));
        camino[28].setIcon(new ImageIcon(getClass().getResource("numero29.jpg")));
        camino[29].setIcon(new ImageIcon(getClass().getResource("numero30.jpg")));
        camino[30].setIcon(new ImageIcon(getClass().getResource("numero31.jpg")));
        camino[31].setIcon(new ImageIcon(getClass().getResource("numero32.jpg")));
        camino[32].setIcon(new ImageIcon(getClass().getResource("numero33.jpg")));
        camino[33].setIcon(new ImageIcon(getClass().getResource("numero34.jpg")));

        camino[34].setIcon(new ImageIcon(getClass().getResource("numero35.jpg")));*/
        
        //Manejadores de eventos 
        ActionListener oyente1;
        oyente1 = new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                jbtnTirar.setVisible(true);
                jbtnInstru.setVisible(true);
                numero1 = avanzar(numero);
                if(numero1!=0){
                    numero = numero1;
                    botinstru.setIcon(new ImageIcon(getClass().getResource("")));
                    continua = ganador(numero1);
                    if(continua==0){
                    JOptionPane.showMessageDialog(null, "Jugador esta en la casilla " + numero1);
                    }else{
                      JOptionPane.showMessageDialog(null, "Has ganado!!");
                    }
                }
                
            }
        };
       
              
        ActionListener oyente2 = new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                JOptionPane.showMessageDialog(contenedor1,"1.Serpientes y escaleras se juega por dos a cuatro jugadores, cada uno se mueve independiente por el tablero.\n2.Los jugadores tiran un dado, y luego se mueven según el número designado, entre uno y seis casillas.\n Una vez que aterrizan en un casilla, tienen que realizar la acción designada por la casilla.");
            }
        };
        
        //Agregar oyente al boton
        jbtnTirar.addActionListener(oyente1);
        jbtnInstru.addActionListener(oyente2);
        
        //Fondo del frame 
       fondo = new JLabel(imgo[0]);
       fondo.setBounds(0,0,1000,700);
       contenedor.add(fondo);
              
    }
       public int avanzar(int val) {
        
        try{
            camino[val-1].setIcon(new ImageIcon(getClass().getResource("numero/"+String.valueOf(val)+".jpg")));
        }
        catch(Exception e){
        }
           
           numdado = dado();
        val = val + numdado;
        if(val>=34){
        JOptionPane.showMessageDialog(null, "Jugador ha caido " + numdado);
        return 0;
        }
        else{
        JOptionPane.showMessageDialog(null, "Jugador ha caido " + numdado);
        if (trampa[val] > 0) {
            val = val + trampa[val];
            JOptionPane.showMessageDialog(null, "Escalera sube a la casilla " + val);
        }
        else if (trampa[val]< 0) {
            val = val + trampa[val];
            JOptionPane.showMessageDialog(null, "Serpiente baja a la casilla " + val);
        }
        
        camino[val-1].setText(String.valueOf(val-1));
        camino[val-1].setIcon(new ImageIcon(getClass().getResource("principal.png")));
        return val;
        }
        
    }
       
    public int dado() {
        double rann = Math.random() * (6) + 1;
        return (int) rann;
    }

        public int ganador(int val) {
        {
            if (val >= 35){
            return 1;
            }
            else{
            return 0;
            }
            
        }
    }
}

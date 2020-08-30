package ComaFlotante;

import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    public static String hex_bin(char num) {
        String bin = "";
        switch (num) {
            case '0':
                bin = "0000";
                break;
            case '1':
                bin = "0001";
                break;
            case '2':
                bin = "0010";
                break;
            case '3':
                bin = "0011";
                break;
            case '4':
                bin = "0100";
                break;
            case '5':
                bin = "0101";
                break;
            case '6':
                bin = "0110";
                break;
            case '7':
                bin = "0111";
                break;
            case '8':
                bin = "1000";
                break;
            case '9':
                bin = "1001";
                break;
            case 'A':
                bin = "1010";
                break;
            case 'B':
                bin = "1011";
                break;
            case 'C':
                bin = "1100";
                break;
            case 'D':
                bin = "1101";
                break;
            case 'E':
                bin = "1110";
                break;
            case 'F':
                bin = "1111";
                break;
            default:
                JOptionPane.showMessageDialog(null, num + " No es número hexadecimal");
                bin = "";
                break;
        }
        return bin;
    }

    public static int exp_dec(char bin, int pos) {
        int dec;

        if (bin == '1') {
            dec = (int) (1 * Math.pow(2, pos));
        } else {
            dec = (int) (0 * Math.pow(2, pos));
        }

        return dec;
    }

    public static double mant_dec(char bin, float pos) {
        double dec;

        if (bin == '1') {
            dec = (double) (1 * Math.pow(2, pos));
        } else {
            dec = (double) (0 * Math.pow(2, pos));
        }

        return dec;
    }

    public static String numero_a(int entero) {
        String binario = "";
        int residuo;
        if (entero == 0) {
            binario = "0";
        } else {
            while (entero > 0) {
                residuo = entero % 2;
                binario = residuo + binario;
                entero = entero / 2;
            }
        }
        return binario;
    }

    public static String numero_b(double resultado) {
        String multipl = "";
        int g1;
        for (int i = 1; i <= 23; i++) {
            if (resultado >= 1) {
                resultado = resultado - 1;
            }
            resultado = resultado * 2;
            int gl = (int) resultado;
            multipl = multipl + gl;
        }

        return multipl;
    }

    public static String numero_c(double resultado, int posicion) {
        String multipl = "";
        int g1;
        for (int i = 1; i <= (23 + posicion); i++) {
            if (resultado >= 1) {
                resultado = resultado - 1;
            }
            resultado = resultado * 2;
            int gl = (int) resultado;
            multipl = multipl + gl;
        }

        return multipl;
    }

    public static String exponente_binario(int exp) {
        exp = 127 + exp;
        return numero_a(exp);
    }

    public static String signohexa(int entero) {
        String signo;
        if (entero >= 0) {
            signo = "0";
        } else {
            signo = "1";
        }
        return signo;
    }

    public static String exphexa(String exp) {
        char[] valor_1 = exp.toCharArray();
        int exponente;
        if (valor_1.length < 8) {
            exponente = 8 - valor_1.length;
            for (int i = 1; i <= exponente; i++) {
                exp = "0" + exp;
            }
        }
        return exp;
    }

    public static String mantisahexa(String notacion) {
        char[] valor_1 = notacion.toCharArray();
        int mantisa;
        if (valor_1.length < 23) {
            mantisa = 23 - valor_1.length;
            for (int i = 1; i <= mantisa; i++) {
                notacion = notacion + "0";
            }
        }
        return notacion;
    }

    public static String conversiones(String v) {
        if (null != v) {
            switch (v) {
                case "0000":
                    v = "0";
                    break;
                case "0001":
                    v = "1";
                    break;
                case "0010":
                    v = "2";
                    break;
                case "0011":
                    v = "3";
                    break;
                case "0100":
                    v = "4";
                    break;
                case "0101":
                    v = "5";
                    break;
                case "0110":
                    v = "6";
                    break;
                case "0111":
                    v = "7";
                    break;
                case "1000":
                    v = "8";
                    break;
                case "1001":
                    v = "9";
                    break;
                case "1010":
                    v = "A";
                    break;
                case "1011":
                    v = "B";
                    break;
                case "1100":
                    v = "C";
                    break;
                case "1101":
                    v = "D";
                    break;
                case "1110":
                    v = "E";
                    break;
                case "1111":
                    v = "F";
                    break;
                default:
                    break;
            }
        }
        return v;
    }

    public static String hexadecimal(String signo, String exponente, String mantisa) {
        String hexadecimal1 = signo + exponente + mantisa;
        char[] valorfin = hexadecimal1.toCharArray();
        String resultado = "";
        hexadecimal1 = "";
        int cont = 0;

        for (int i = 0; i <= valorfin.length - 1; i = i + 4) {
            for (int j = i; j <= i + 3; j++) {
                resultado = resultado + valorfin[j];
            }
            hexadecimal1 = hexadecimal1 + conversiones(resultado);
            resultado = "";
        }

        return hexadecimal1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        codificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        num2 = new javax.swing.JTextField();
        decodificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        binario1 = new javax.swing.JLabel();
        binario = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        notcien1 = new javax.swing.JLabel();
        notcien = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        expbin1 = new javax.swing.JLabel();
        expbin = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bin321 = new javax.swing.JLabel();
        bin32 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        hexadec1 = new javax.swing.JLabel();
        hexadec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(184, 233, 148));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplicacion IEEE - 754");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel3.setBackground(new java.awt.Color(184, 233, 148));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setBackground(new java.awt.Color(184, 233, 148));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Codificar numero:");
        jPanel3.add(jLabel2);
        jPanel3.add(num1);

        codificar.setBackground(new java.awt.Color(184, 233, 148));
        codificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codificar.setText("Codificar");
        codificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codificarActionPerformed(evt);
            }
        });
        jPanel3.add(codificar);

        jPanel1.add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(184, 233, 148));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setBackground(new java.awt.Color(184, 233, 148));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Decodificar numero hexadecimal:");
        jPanel2.add(jLabel3);
        jPanel2.add(num2);

        decodificar.setBackground(new java.awt.Color(184, 233, 148));
        decodificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        decodificar.setText("Decodificar");
        decodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodificarActionPerformed(evt);
            }
        });
        jPanel2.add(decodificar);

        jPanel1.add(jPanel2);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        binario1.setBackground(new java.awt.Color(255, 255, 255));
        binario1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        binario1.setOpaque(true);
        jPanel5.add(binario1);

        binario.setBackground(new java.awt.Color(255, 255, 255));
        binario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        binario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        binario.setOpaque(true);
        jPanel5.add(binario);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        notcien1.setBackground(new java.awt.Color(255, 255, 255));
        notcien1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        notcien1.setOpaque(true);
        jPanel6.add(notcien1);

        notcien.setBackground(new java.awt.Color(255, 255, 255));
        notcien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        notcien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notcien.setOpaque(true);
        jPanel6.add(notcien);

        jPanel1.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        expbin1.setBackground(new java.awt.Color(255, 255, 255));
        expbin1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        expbin1.setOpaque(true);
        jPanel7.add(expbin1);

        expbin.setBackground(new java.awt.Color(255, 255, 255));
        expbin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        expbin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expbin.setOpaque(true);
        jPanel7.add(expbin);

        jPanel1.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        bin321.setBackground(new java.awt.Color(255, 255, 255));
        bin321.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bin321.setOpaque(true);
        jPanel8.add(bin321);

        bin32.setBackground(new java.awt.Color(255, 255, 255));
        bin32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bin32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin32.setOpaque(true);
        jPanel8.add(bin32);

        jPanel1.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        hexadec1.setBackground(new java.awt.Color(255, 255, 255));
        hexadec1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hexadec1.setOpaque(true);
        jPanel9.add(hexadec1);

        hexadec.setBackground(new java.awt.Color(255, 255, 255));
        hexadec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hexadec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hexadec.setOpaque(true);
        jPanel9.add(hexadec);

        jPanel1.add(jPanel9);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void codificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codificarActionPerformed
        double decimal2 = Double.parseDouble(num1.getText());
        int sign1 = (int) decimal2;
        if (decimal2 < 0) {
            decimal2 = decimal2 * -1;
        }
        //Separar parte entera de parte decimal y convertir a binario
        int entero = (int) decimal2;
        decimal2 = (double) (decimal2 - entero);
        if (decimal2 == 0) {
            binario1.setText("Numero binario: ");
            binario.setText(numero_a(entero));
        } else {
            binario1.setText("Numero binario: ");
            binario.setText(numero_a(entero) + "," + numero_b(decimal2));
        }

        //Escribir notacion cientifica
        int exp;
        String notacion = "";
        char[] cadena_entera = numero_a(entero).toCharArray();
        char[] cadena_decimal;

        if (decimal2 == 0) {
            exp = cadena_entera.length - 1;
            for (int i = 1; i < cadena_entera.length; i++) {
                notacion = notacion + cadena_entera[i];
            }
            notcien1.setText("Notacion cientifica: ");
            notcien.setText("1." + notacion + "x2^" + exp);
            expbin1.setText("Exponente binario: ");
            expbin.setText(exponente_binario(exp));
            bin321.setText("32 Bits: ");
            bin32.setText(signohexa(sign1) + " " + exphexa(exponente_binario(exp)) + " " + mantisahexa(notacion));
            hexadec1.setText("Hexadecimal: ");
            hexadec.setText(hexadecimal(signohexa(sign1), exphexa(exponente_binario(exp)), mantisahexa(notacion)));
        } else {
            cadena_decimal = numero_b(decimal2).toCharArray();
            //Caso tal que numero binario la parte entera tenga mas de dos numeros
            if (cadena_entera.length > 1) {
                exp = cadena_entera.length - 1;
                for (int i = 1; i < cadena_entera.length; i++) {
                    notacion = notacion + cadena_entera[i];
                }
                int completar = 23 - (cadena_entera.length - 1);
                for (int i = 0; i < completar; i++) {
                    notacion = notacion + cadena_decimal[i];
                }
                notcien1.setText("Notacion cientifica: ");
                notcien.setText("1." + notacion + "x2^" + exp);
                expbin1.setText("Exponente binario: ");
                expbin.setText(exponente_binario(exp));
                bin321.setText("32 Bits: ");
                bin32.setText(signohexa(sign1) + " " + exphexa(exponente_binario(exp)) + " " + mantisahexa(notacion));
                hexadec1.setText("Hexadecimal: ");
                hexadec.setText(hexadecimal(signohexa(sign1), exphexa(exponente_binario(exp)), mantisahexa(notacion)));
            } else {
                //Caso en que la parte entera del numero binario solo sea 1
                if (cadena_entera[0] == '1') {
                    exp = 0;
                    for (int i = 0; i < cadena_decimal.length; i++) {
                        notacion = notacion + cadena_decimal[i];
                    }
                    notcien1.setText("Notacion cientifica: ");
                    notcien.setText("1." + notacion + "x2^" + exp);
                    expbin1.setText("Exponente binario: ");
                    expbin.setText(exponente_binario(exp));
                    bin321.setText("32 Bits: ");
                    bin32.setText(signohexa(sign1) + " " + exphexa(exponente_binario(exp)) + " " + mantisahexa(notacion));
                    hexadec1.setText("Hexadecimal: ");
                    hexadec.setText(hexadecimal(signohexa(sign1), exphexa(exponente_binario(exp)), mantisahexa(notacion)));
                } else {
                    //caso tal en que la parte entera del binario sea igual a 0
                    char valor1 = '0';
                    int posicion = 0;
                    while (valor1 == '0') {
                        valor1 = cadena_decimal[posicion];
                        posicion++;
                    }

                    cadena_decimal = numero_c(decimal2, posicion).toCharArray();
                    exp = posicion * -1;
                    for (int i = posicion; i < cadena_decimal.length; i++) {
                        notacion = notacion + cadena_decimal[i];
                    }
                    notcien1.setText("Notacion cientifica: ");
                    notcien.setText("1." + notacion + "x2^" + exp);
                    expbin1.setText("Exponente binario: ");
                    expbin.setText(exponente_binario(exp));
                    bin321.setText("32 Bits: ");
                    bin32.setText(signohexa(sign1) + " " + exphexa(exponente_binario(exp)) + " " + mantisahexa(notacion));
                    hexadec1.setText("Hexadecimal: ");
                    hexadec.setText(hexadecimal(signohexa(sign1), exphexa(exponente_binario(exp)), mantisahexa(notacion)));
                }
            }
        }
    }//GEN-LAST:event_codificarActionPerformed


    private void decodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodificarActionPerformed
        if (num2.getText().toLowerCase().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un valor hexadecimal");
            num2.setText("");
            num2.requestFocus();
        } else if (num2.getText().toLowerCase().length() != 8) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese 8 valores hexadecimales");
            num2.setText("");
            num2.requestFocus();
        } else {
            //Convertir hexadecimal a binario
            String hexadecimal = num2.getText().toString().toUpperCase();
            char[] binarios = hexadecimal.toCharArray();

            hexadecimal = "";
            for (int i = 0; i < binarios.length; i++) {
                hexadecimal = hexadecimal + hex_bin(binarios[i]);
            }
            binario1.setText("Numero binario: ");
            binario.setText(hexadecimal);

            //Mostrar el exponente en binarios
            String exponenteb = "";
            binarios = hexadecimal.toCharArray();
            for (int i = 1; i < 9; i++) {
                exponenteb = exponenteb + binarios[i];
            }
            notcien1.setText("Exponente: ");
            notcien.setText(exponenteb);

            //Mostrar la mantisa en binarios
            String mantisab = "";
            for (int i = 9; i < binarios.length; i++) {
                mantisab = mantisab + binarios[i];
            }
            expbin1.setText("Mantisa: ");
            expbin.setText(mantisab);

            //Convertir exponente binario a decimal
            char[] exponentec = exponenteb.toCharArray();
            int cont = 7;
            int exp = 0;
            for (int i = 0; i <= exponentec.length - 1; i++) {
                exp = exp + exp_dec(exponentec[i], cont);
                cont--;
            }
            exp = -127 + exp;
            bin321.setText("Exponente decimal: ");
            bin32.setText(String.valueOf(exp));

            //Convertir mantisa binaria a decimal
            char[] mantisac = mantisab.toCharArray();
            cont = -1;
            double mant = 0;
            for (int i = 0; i <= mantisac.length - 1; i++) {
                mant = mant + mant_dec(mantisac[i], cont);
                cont--;
            }
            mant = (float) ((1 + mant) * Math.pow(2, exp));

            //Asginar signo al numero final
            if (binarios[0] == '1') {
                mant = mant * -1;
            }

            //Mostrar numero final
            hexadec1.setText("Decimal: ");
            hexadec.setText(String.valueOf(mant));
        }


    }//GEN-LAST:event_decodificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Interfaz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bin32;
    private javax.swing.JLabel bin321;
    private javax.swing.JLabel binario;
    private javax.swing.JLabel binario1;
    private javax.swing.JButton codificar;
    private javax.swing.JButton decodificar;
    private javax.swing.JLabel expbin;
    private javax.swing.JLabel expbin1;
    private javax.swing.JLabel hexadec;
    private javax.swing.JLabel hexadec1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel notcien;
    private javax.swing.JLabel notcien1;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    // End of variables declaration//GEN-END:variables
}

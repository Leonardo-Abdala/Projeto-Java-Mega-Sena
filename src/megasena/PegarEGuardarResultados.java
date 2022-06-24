/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megasena;

/**
 *
 * @author SuperAbdala
 */
public class PegarEGuardarResultados {

    public String linharecebida;
    public String concatenar;
    public String sorteio1, sorteio2, sorteio3, sorteio4, sorteio5, sorteio6;
    public String codigo;
    public String dia, mes, ano;
    public int contador;

    public void pegarLinha(String linha) {
        linharecebida = linha + "..";
        contador = 1;
        concatenar = "";
        for (int i = 0; i < linharecebida.length() - 1; i++) {
            if (contador == 10) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    sorteio6 = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 9) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    sorteio5 = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 8) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    sorteio4 = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 7) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    sorteio3 = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 6) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    sorteio2 = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 5) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    sorteio1 = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 4) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    ano = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 3) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    mes = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 2) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    dia = concatenar;
                    concatenar = "";
                    contador++;
                }
            }

            if (contador == 1) {
                if (Character.isDigit(linharecebida.charAt(i)) == true) {
                    concatenar += linharecebida.charAt(i);
                } else {
                    codigo = concatenar;
                    concatenar = "";
                    contador++;
                }
            }
        }
    }
    
    
    
}

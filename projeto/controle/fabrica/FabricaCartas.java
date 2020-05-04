
package main.java.projeto.controle.fabrica;
import main.java.projeto.modelo.entidades.Carta;
import main.java.projeto.modelo.entidades.CartaComum;
import main.java.projeto.modelo.entidades.CartaEspecial;
import main.java.projeto.modelo.enumeradores.Acao;
import main.java.projeto.modelo.enumeradores.Cor;
import main.java.projeto.visao.imagensagrupadas.ImagensNumericas;
import main.java.projeto.visao.imagensagrupadas.ImagensEspeciais;
import javax.swing.ImageIcon;

public class FabricaCartas {
    private static int numeroCarta = 9;
    private static int indice = 0;
    private static ImageIcon frenteCarta = new ImageIcon();
    private static ImagensNumericas umaImagem = new ImagensNumericas();
    private static ImagensEspeciais umaImagemE = new ImagensEspeciais();
    
    
    private static CartaComum fabricarCartaComum(int numero, Cor cor, ImageIcon frenteCarta){
        CartaComum umaCarta = new CartaComum(numero, cor, frenteCarta);
        
        return umaCarta;
    }
    
    private static CartaEspecial fabricarCartaEspecial(Cor cor, Acao acao, ImageIcon frenteCarta){
        CartaEspecial umaCarta = new CartaEspecial(cor, acao, frenteCarta);
        
        return umaCarta;
    } 
    
    public static Carta fabricarCartas(int numero){ 
        if(numero < 77){
    
            if(numero < 20){ 
                if(numeroCarta < 0){
                    numeroCarta = 9;
                }
                
                frenteCarta = (ImageIcon) umaImagem.obterAmarelas(indice++);
                
                return fabricarCartaComum(numeroCarta--, Cor.AMARELO, frenteCarta); 
            
            }else if(numero > 19 || numero < 39){
                if(numeroCarta < 0 || indice == 20){
                    if(numeroCarta < 0){
                        numeroCarta = 9;
                    } 
                    
                    if(indice == 20){
                        indice = 0;
                    }
                }
                
                frenteCarta = (ImageIcon) umaImagem.obterAzuis(indice++);
                
                return fabricarCartaComum(numeroCarta--, Cor.AZUL, frenteCarta);
            
            }else if(numero > 38 && numero < 58){
                if(numeroCarta < 0 || indice == 20){
                    if(numeroCarta < 0){
                        numeroCarta = 9;
                    }
                    
                    if(indice == 20){
                        indice = 0;
                    }
                }

                frenteCarta = (ImageIcon) umaImagem.obterVerdes(indice++);
                
                return fabricarCartaComum(numeroCarta--, Cor.VERDE, frenteCarta);
            
            }else if(numero > 57 && numero < 77){
                if(numeroCarta < 0 || indice == 20){
                    if(numeroCarta < 0){
                        numeroCarta = 9;
                    }
                    
                    if(indice == 20){
                        indice = 0;
                    }
                }
   
                frenteCarta = (ImageIcon) umaImagem.obterVermelhas(indice++);
                
                return fabricarCartaComum(numeroCarta--, Cor.VERMELHO, frenteCarta);
                
            }
            
            
        }else{
            
            if(numero > 76 && numero < 85){
                if(numero > 76 && numero < 79){
                    frenteCarta = (ImageIcon) umaImagemE.obterBloquearAmarelas(0);
                    return fabricarCartaEspecial(Cor.AMARELO, Acao.BLOQUEAR, frenteCarta);
                
                }else if(numero > 78 && numero < 81){
                    frenteCarta = (ImageIcon) umaImagemE.obterBloquearAzuis(0);
                    return fabricarCartaEspecial(Cor.AZUL, Acao.BLOQUEAR, frenteCarta);
                
                }else if(numero > 80 && numero < 83){
                    frenteCarta = (ImageIcon) umaImagemE.obterBloquearVerdes(0);
                    return fabricarCartaEspecial(Cor.VERDE, Acao.BLOQUEAR, frenteCarta);
                
                }else if(numero > 82 && numero < 85){
                    frenteCarta = (ImageIcon) umaImagemE.obterBloquearVermelhas(0);
                    return fabricarCartaEspecial(Cor.VERMELHO, Acao.BLOQUEAR, frenteCarta);
                }
                
            }else if(numero > 84 && numero < 93){
                if(numero > 84 && numero < 87){
                    frenteCarta = (ImageIcon) umaImagemE.obterInverterAmarelas(0);
                    return fabricarCartaEspecial(Cor.AMARELO, Acao.INVERTER, frenteCarta);
                
                }else if(numero > 86 && numero < 89){
                    frenteCarta = (ImageIcon) umaImagemE.obterInverterAzuis(0);
                    return fabricarCartaEspecial(Cor.AZUL, Acao.INVERTER, frenteCarta);
                
                }else if(numero > 88 && numero < 91){
                    frenteCarta = (ImageIcon) umaImagemE.obterInverterVerdes(0);
                    return fabricarCartaEspecial(Cor.VERDE, Acao.INVERTER, frenteCarta);
                
                }else if(numero > 90 && numero < 93){
                    frenteCarta = (ImageIcon) umaImagemE.obterInverterVermelhas(0);
                    return fabricarCartaEspecial(Cor.VERMELHO, Acao.INVERTER, frenteCarta);
                }
                
            }else if(numero > 92 && numero < 101){
                if(numero > 92 && numero < 95){
                    frenteCarta = (ImageIcon) umaImagemE.obterComprar2Amarelas(0);
                    return fabricarCartaEspecial(Cor.AMARELO, Acao.COMPRAR_DUAS, frenteCarta);
                
                }else if(numero > 94 && numero < 97){
                    frenteCarta = (ImageIcon) umaImagemE.obterComprar2Azuis(0);
                    return fabricarCartaEspecial(Cor.AZUL, Acao.COMPRAR_DUAS, frenteCarta);
                
                }else if(numero > 96 && numero < 99){
                    frenteCarta = (ImageIcon) umaImagemE.obterComprar2Verdes(0);
                    return fabricarCartaEspecial(Cor.VERDE, Acao.COMPRAR_DUAS, frenteCarta);
                
                }else if(numero > 98 && numero < 101){
                    frenteCarta = (ImageIcon) umaImagemE.obterComprar2Vermelhas(0);
                    return fabricarCartaEspecial(Cor.VERMELHO, Acao.COMPRAR_DUAS, frenteCarta);
                }

            }else if(numero > 100 && numero < 105){
                frenteCarta = (ImageIcon) umaImagemE.obterComprar4(0);
                return fabricarCartaEspecial(Cor.PRETA, Acao.COMPRAR_QUATRO, frenteCarta);
            
            }else if(numero > 104 && numero < 109){
                frenteCarta = (ImageIcon) umaImagemE.obterMudarCor(0);
                return fabricarCartaEspecial(Cor.PRETA, Acao.MUDAR_COR, frenteCarta);
            
            }       
        }
    
        return null;
    }
       
    
}

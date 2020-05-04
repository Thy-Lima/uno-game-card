
package main.java.projeto.visao.ambiente;
import main.java.projeto.controle.operacoes.Operacoes;
import main.java.projeto.visao.mesa.Mesa;
import main.java.projeto.modelo.threads.ExibirCartas;
import main.java.projeto.modelo.estruturas.DeckJogador;
import main.java.projeto.modelo.entidades.Carta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


public class TelaPrincipal extends JFrame implements ActionListener{
    
    private Operacoes controle;
    private JButton[] jogador1;
    private JButton[] jogador2;
    private JButton[] pilhaCentral;
    private JButton iniciarPartida;
    private JLabel insercaoNomeJogador1;
    private JLabel insercaoNomeJogador2;
    private JLabel imagemInicial;
    private JButton nomeExibicao;
    private String nomeJogador1;
    private String nomeJogador2;
    private JTextArea campoJogador1;
    private JTextArea campoJogador2;
    private Mesa mesa;
    private JPanel superiorPrimario;
    private JPanel inferiorPrimario;
    private JPanel direitaPrimario;
    private JPanel esquerdaPrimario;
    private JPanel centralPrimario;
    private JPanel superiorSecundario;
    private JPanel inferiorSecundario;
    private JPanel centralSecundario;
    private JPanel internoCentralSecundario;
    private JPanel internoLimite;
    private JPanel notificacaoCentro;
    private JPanel notificacaoEsquerda;
    private JPanel notificacaoDireita;
    private JPanel notificacaoSuperior;
    private JPanel notificacaoInferior;
    private ExibirCartas exibirCartas;
    
    public TelaPrincipal(){
       super("UNO");
       setLocationRelativeTo(null);
       setSize(500, 500);
       setLayout(new GridLayout(1, 1));
       this.controle = new Operacoes();
       this.jogador1 = new JButton[7];
       this.jogador2 = new JButton[7];
       this.pilhaCentral = new JButton[2];
       this.iniciarPartida = new JButton("Iniciar");
       this.insercaoNomeJogador1 = new JLabel("     Jogador 1, insira seu nome: ");
       this.insercaoNomeJogador2 = new JLabel("     Jogador 2, insira seu nome: ");
       this.nomeExibicao = new JButton("");
       this.imagemInicial = new JLabel(new ImageIcon(getClass().getResource("/main/java/projeto/visao/imagens/Capa.jpg")));
       this.campoJogador1 = new JTextArea(2, 2);
       this.campoJogador2 = new JTextArea(2, 2);
       this.superiorPrimario = new JPanel();
       this.inferiorPrimario = new JPanel();
       this.direitaPrimario = new JPanel();
       this.esquerdaPrimario = new JPanel();
       this.centralPrimario = new JPanel();
       this.superiorSecundario = new JPanel();
       this.inferiorSecundario = new JPanel();
       this.centralSecundario = new JPanel();
       this.internoCentralSecundario = new JPanel();
       this.internoLimite = new JPanel();
       this.notificacaoCentro = new JPanel();
       this.notificacaoDireita = new JPanel();
       this.notificacaoEsquerda = new JPanel();
       this.notificacaoInferior = new JPanel();
       this.notificacaoSuperior = new JPanel();
       this.notificacaoCentro.setOpaque(false);
       this.notificacaoCentro.setLayout(new BorderLayout());
       this.notificacaoDireita.setOpaque(false);
       this.notificacaoDireita.setLayout(new GridLayout(1, 2));
       this.notificacaoEsquerda.setOpaque(false);
       this.notificacaoEsquerda.setLayout(new GridLayout(1, 2));
       this.notificacaoInferior.setOpaque(false);
       this.notificacaoInferior.setLayout(new GridLayout(12, 1));
       this.notificacaoSuperior.setOpaque(false);
       this.notificacaoSuperior.setLayout(new GridLayout(12, 1));
       
       for(int i = 0; i < 2; i++){
           this.notificacaoDireita.add(new JLabel("   "));
           this.notificacaoEsquerda.add(new JLabel("   "));
       }
       
       for(int i = 0; i < 12; i++){
           this.notificacaoInferior.add(new JLabel("   "));
           this.notificacaoSuperior.add(new JLabel("   "));
       }
       
       this.notificacaoCentro.add(this.notificacaoSuperior, BorderLayout.NORTH);
       this.notificacaoCentro.add(this.notificacaoInferior, BorderLayout.SOUTH);
       this.notificacaoCentro.add(this.notificacaoDireita, BorderLayout.EAST);
       this.notificacaoCentro.add(this.notificacaoEsquerda, BorderLayout.WEST);
       this.notificacaoCentro.add(this.nomeExibicao, BorderLayout.CENTER);
       
       this.superiorSecundario.setOpaque(false);
       this.superiorSecundario.setLayout(new GridLayout(1, 7));
       this.inferiorSecundario.setOpaque(false);
       this.inferiorSecundario.setLayout(new GridLayout(1, 7));
       this.campoJogador1.setSize(5, 1);
       this.campoJogador2.setSize(5, 1);
       this.campoJogador1.setBorder(new LineBorder(Color.BLACK, 10));
       this.campoJogador1.setFont(new Font("Arial Narrow", Font.BOLD, 20));
       this.campoJogador2.setBorder(new LineBorder(Color.BLACK, 10));
       this.campoJogador2.setFont(new Font("Arial Narrow", Font.BOLD, 20)); 
       this.mesa = new Mesa();
       
       for(int i = 0; i < 7; i++){
           this.jogador1[i] = new JButton();
           this.jogador1[i].setBorderPainted(false);
           this.jogador1[i].setOpaque(false);
           this.jogador1[i].setContentAreaFilled(false);
           this.jogador1[i].setIcon(null);
           this.jogador2[i] = new JButton();
           this.jogador2[i].setBorderPainted(false);
           this.jogador2[i].setOpaque(false);
           this.jogador2[i].setContentAreaFilled(false);
           this.jogador2[i].setIcon(null);
       }
       
       for(int i = 0; i < 2; i++){
           if(i == 0){
               this.pilhaCentral[i] = new JButton();
               this.pilhaCentral[i].setBorderPainted(false);
               this.pilhaCentral[i].setOpaque(false);
               this.pilhaCentral[i].setContentAreaFilled(false);
               this.pilhaCentral[i].setIcon(null);
               
           }else{
               this.pilhaCentral[i] = new JButton();
               this.pilhaCentral[i].setBorderPainted(false);
               this.pilhaCentral[i].setOpaque(false);
               this.pilhaCentral[i].setContentAreaFilled(false);
               this.pilhaCentral[i].setIcon(new ImageIcon(getClass().getResource("/main/java/projeto/visao/imagens/pilha.png")));
           }
       }
       
       this.iniciarPartida.setBorder(new LineBorder(Color.BLACK, 10));
       this.iniciarPartida.setForeground(Color.WHITE);
       this.iniciarPartida.setFont(new Font("Arial Narrow", Font.BOLD, 25));
       this.iniciarPartida.setBackground(new Color(200, 0, 0));
       this.iniciarPartida.setContentAreaFilled(true);
       this.insercaoNomeJogador1.setForeground(Color.WHITE);
       this.insercaoNomeJogador1.setFont(new Font("Arial Narrow", Font.BOLD, 25));
       this.insercaoNomeJogador2.setForeground(Color.WHITE);
       this.insercaoNomeJogador2.setFont(new Font("Arial Narrow", Font.BOLD, 25));
       this.nomeExibicao.setForeground(Color.WHITE);
       this.nomeExibicao.setContentAreaFilled(true);
       this.nomeExibicao.setBackground(new Color(10, 5, 5));
       this.nomeExibicao.setBorder(new LineBorder(new Color(200, 0, 0), 10));
       this.nomeExibicao.setFont(new Font("Arial Narrow", Font.BOLD, 25));
       
       this.superiorPrimario.setOpaque(false);
       this.superiorPrimario.setLayout(new GridLayout(2, 1));
       
       for(int i = 0; i < 2; i++){
           this.superiorPrimario.add(new JLabel(" "));  
       }
       
       this.inferiorPrimario.setOpaque(false);
       this.inferiorPrimario.setLayout(new GridLayout(2, 1));
       
       for(int i = 0; i < 2; i++){
           this.inferiorPrimario.add(new JLabel(" ")); 
       }
       
       this.direitaPrimario.setOpaque(false);
       this.direitaPrimario.setLayout(new GridLayout(1, 2));
       
       for(int i = 0; i < 2; i++){
           this.direitaPrimario.add(new JLabel(" ")); 
       }
       
       this.esquerdaPrimario.setOpaque(false);
       this.esquerdaPrimario.setLayout(new GridLayout(1, 2));
       
       for(int i = 0; i < 2; i++){
           this.esquerdaPrimario.add(new JLabel(" ")); 
       }
       
       this.centralPrimario.setOpaque(false);
       this.centralPrimario.setLayout(new GridLayout(1, 2));
       this.centralSecundario.setOpaque(false);
       this.centralSecundario.setLayout(new GridLayout(1, 3));
       
       this.internoCentralSecundario.setBackground(new Color(0, 0, 0));
       this.internoCentralSecundario.setBorder(new LineBorder(Color.WHITE, 10));
       this.internoCentralSecundario.setLayout(new GridLayout(5, 1));
       this.internoCentralSecundario.add(this.insercaoNomeJogador1);
       this.internoCentralSecundario.add(this.campoJogador1);
       this.internoCentralSecundario.add(this.insercaoNomeJogador2);
       this.internoCentralSecundario.add(this.campoJogador2);
       this.internoCentralSecundario.add(this.iniciarPartida);
       
       this.internoLimite.setLayout(new BorderLayout());
       this.internoLimite.setOpaque(false);
       this.internoLimite.add(new JLabel("                                                                                "), BorderLayout.EAST);
       this.internoLimite.add(new JLabel("   "), BorderLayout.WEST);
       this.internoLimite.add(new JLabel("  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n"), BorderLayout.NORTH);
       this.internoLimite.add(new JLabel("  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n"), BorderLayout.SOUTH);
       this.internoLimite.add(this.internoCentralSecundario, BorderLayout.CENTER);
       this.centralPrimario.add(this.imagemInicial);
       this.centralPrimario.add(this.internoLimite);
       this.centralSecundario.add(this.pilhaCentral[0]);
       this.centralSecundario.add(this.pilhaCentral[1]);
       this.iniciarPartida.addActionListener(this);
       this.pilhaCentral[1].addActionListener(this);
       this.mesa.setLayout(new BorderLayout());
       this.mesa.add(this.superiorPrimario, BorderLayout.NORTH);
       this.mesa.add(this.inferiorPrimario, BorderLayout.SOUTH);
       this.mesa.add(this.direitaPrimario, BorderLayout.WEST);
       this.mesa.add(this.esquerdaPrimario, BorderLayout.EAST);
       this.mesa.add(this.centralPrimario, BorderLayout.CENTER);
       
       add(this.mesa);
       setExtendedState(MAXIMIZED_BOTH);
       setVisible(true); 
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.iniciarPartida){
            if(!(this.campoJogador1.getText().equals("") || this.campoJogador2.getText().equals(""))){
                this.centralPrimario.setVisible(false);
                this.mesa.add(this.centralSecundario, BorderLayout.CENTER);
                this.nomeJogador1 = this.campoJogador1.getText();
                this.nomeJogador2 = this.campoJogador2.getText();
                this.nomeExibicao.setText(this.nomeJogador1 + ", compre as cartas!!!");
                this.superiorPrimario.setVisible(false);
                this.inferiorPrimario.setVisible(false);
                
                for(int i = 0; i < 7; i++){
                    this.inferiorSecundario.add(this.jogador1[i]);
                    this.superiorSecundario.add(this.jogador2[i]);         
                }
                
                this.mesa.add(this.inferiorSecundario, BorderLayout.SOUTH);
                this.mesa.add(this.superiorSecundario, BorderLayout.NORTH);
                this.centralSecundario.add(this.notificacaoCentro);
                
            }
               
        }
        
        if(e.getSource() == this.pilhaCentral[1]){
            if(this.controle.getJogador1().tamanho() < 7){
                this.controle.gerarDeck(this.controle.getJogador1());
                this.nomeExibicao.setText(this.nomeJogador1 + ", veja as cartas!!!");
                ExibirCartas t1 = new ExibirCartas(this.jogador1, this.controle.getJogador1(), this.pilhaCentral[1], this.nomeExibicao, this.nomeJogador2 + ", compre as cartas!!!");
                t1.start();
                
                
                          
            }else if(this.controle.getJogador2().tamanho() < 7){
                this.inferiorSecundario.setVisible(false);
                this.controle.gerarDeck(this.controle.getJogador2());
                this.nomeExibicao.setText(this.nomeJogador2 + ", veja as cartas!!!");
                ExibirCartas t2 = new ExibirCartas(this.jogador2, this.controle.getJogador2(), this.pilhaCentral[1], this.nomeExibicao, this.nomeJogador1 + ", selecione a carta inicial!!");
                t2.start();
                
            }else{
                Carta umaCarta = (Carta) this.controle.getPilhaCentral().remover();
                this.pilhaCentral[0].setIcon(umaCarta.getFrenteCarta());
                this.pilhaCentral[1].removeActionListener(this);
                this.inferiorSecundario.setVisible(true);
             
            }
   
        }
      
    }
    
}

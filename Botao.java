import java.awt.*;//Import básico
public class Botao extends Frame { //declara a classe e pega a herança de Frame
    Button b = new Button("Aperte-me");
    Botao( ) {//Construtor
        super("Botao");//Acessa o construtor da classe pai
        add(b);//Adiciona b ao frame
        pack( );//Dimensiona o frame para que todos os componentes estejam em seu tamanho padrão
        setVisible(true);//Torna o frame visível
    }
    static public void main(String[] args) { //Método principal para execução
        new Botao( );
    }
}
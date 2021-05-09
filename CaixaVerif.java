import java.awt.*;//Import básico
class CaixaVerif extends Frame { //declara a classe e pega a herança de Frame
    Checkbox cb = new Checkbox("Caixa de Verificação");
    CaixaVerif( ) {//Construtor
        super("Checkbox");//Acessa o construtor da classe pai
        add(cb);//Adiciona cb ao frame
        pack( );//Dimensiona o frame para que todos os componentes estejam em seu tamanho padrão
        setVisible(true);//Torna o frame visível
    }
    static public void main(String[] args) { //Método principal para execução
        new CaixaVerif( );
    }
}
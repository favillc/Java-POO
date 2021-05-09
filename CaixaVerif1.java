import java.awt.*;//Import básico
class CaixaVerif1 { //declara a classe
    static public void main(String[] args) { //Método principal para execução
        Checkbox cb = new Checkbox("Caixa de Verificação"); //Instância um checkbox
        Frame f = new Frame("CheckBox"); //Instância um Frame
        f.add(cb); //Adiciona cb ao frame
        f.pack( ); //Dimensiona o frame para que todos os componentes estejam em seu tamanho padrão
        f.setVisible(true);//Torna o frame visível
    }
}
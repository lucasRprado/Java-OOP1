package uscs;

public class TesteEmpregado {

    public static void main(String[] args) {
        
        Empregado e1 = new Empregado("Paulo Silva", "Gerente Financeiro", 15400);
        Empregado e2 = new Empregado("Ana Paula", "Analista de Sistema Senior", 10700);
        
        e1.ImprimeEmpregado();
        e2.ImprimeEmpregado();
        
        e2.TotalEmpregados();
        
    }
}

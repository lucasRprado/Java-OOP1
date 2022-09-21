package uscs;

public class Empregado {
    
    private int codigoEmpregado;
    private String nome;
    private String cargo;
    private double salario;
    private static int totalEmpregados = 0;
    
    
    public int getCodigoEmpregado() {
        return codigoEmpregado;
    }

    public void setCodigoEmpregado(int codigoEmpregado) {
        this.codigoEmpregado = codigoEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpregados() {
        return totalEmpregados;
    }

    public static void setTotalEmpregados(int totalEmpregados) {
        Empregado.totalEmpregados = totalEmpregados;
    }
    
    public Empregado(){
        this.codigoEmpregado = totalEmpregados + 1;
        totalEmpregados++;
    }
    
    public Empregado(String nome, String cargo, double salario){
        this.codigoEmpregado = totalEmpregados +1;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        totalEmpregados++;
    }

    public void ImprimeEmpregado(){
        System.out.println("\nEmpregado #" + codigoEmpregado);
        System.out.println("Nome do empregado: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$" + salario);
    }
    
    public void TotalEmpregados(){
        System.out.println("\nTotal de empregados: " + totalEmpregados);
    }
    
}

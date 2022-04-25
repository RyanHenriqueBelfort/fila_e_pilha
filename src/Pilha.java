public class Pilha {
  Pessoa array[];
  int n = 0;

  public Pilha(){
    array = new Pessoa[7];
    n=0;
  }

  public void inserirFim(Pessoa x) throws Exception {
    if (n >= array.length) {
      System.out.println("Erro ao inserir!");
    }

    array[n] = x;
    n++;
  }

  public Pessoa removerFim() throws Exception {
  
    if (n == 0) {
       throw new Exception("Erro ao remover!");
    }

    return array[--n];
 }

  public void mostrar() {
    System.out.print("[ ");
    for (int i = 0; i < n; i++) {
      System.out.print(array[i].getPessoas() + " ");
    }
    System.out.println("]");
  }
}

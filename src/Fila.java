public class Fila {

  Pessoa array[];
  int n = 0;

  public Fila(){
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

  public Pessoa removerInicio() throws Exception {
    if (n == 0) {
      throw new Exception("Erro ao remover!");
    }

    Pessoa resp = array[0];
    n--;

    for (int i = 0; i < n; i++) {
      array[i] = array[i + 1];
    }
    return resp;
  }

  public void mostrar() {
    System.out.print("[ ");
    for (int i = 0; i < n; i++) {
      System.out.print(array[i].getPessoas() + " ");
    }
    System.out.println("]");
  }
}

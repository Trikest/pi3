import java.util.ArrayList;
class Carrinho{
  private ArrayList<Product> produtos;

  public void adicionar(Product produto){
    produtos.add(produto);
    System.out.println("Produto adicionada com sucesso! ao carrinho "+produto.getNumero());

  }
  public void remover(Product produto){
    produtos.remove(produto);
    System.out.println("Produto removido com sucesso! do carrinho "+produto.getNumero());
  }
  public void atualizarqtd(Product produto, int qtd){
    produto.setQtd(qtd);
    System.out.println("Produto atualizado com sucesso! do carrinho "+produto.getNumero());
  }
  public void calcularPreco(){
    double total = 0;
    for(Product produto: produtos){
      total += produto.getPrecoProduto();
    }
    System.out.println("Total: "+total);
  }
  public void listarProdutos(){
    for(Product produto: produtos){
      System.out.println("Produto: "+produto.getNumero()+" - "+produto.getNomeProduto()+" - "+produto.getPrecoProduto());
    }
  }
  public void limparCarrinho(){
    produtos.clear();
    System.out.println("Carrinho limpo com sucesso!");
  }
}

package aula1.br.aula1;

@Controller
@RequestMapping("/ControllerProduto")
public class Cliente {

        List<Produto> produtos = new ArrayList<Produto>();
        Produto produto;
        Produto produto1;
        Produto produto2;
        Produto produto3;
        Produto produto4;
        Produto produto5;


        Cadastra banco = new Cadastra();
        List<Produto> produtos = banco.listProduto();

        response.getWriter().println(produtos);

        produtos.get(1).getNome();
        //chamar as açoes das DAOS, criar cliente para validar email e senha
        response.getWriter().println("<h1> Lista Produtos </h1>");
        response.getWriter().println("<table>"+
        " <tr>"+
        " <th> |NOME|  </th>" +
        " <th> |PREÇO| </th>"+
        " <th> |ESTOQUE| </th>"+
        " <th> |DESCRIÇÃO| </th>"+
        "</tr>");
        response.getWriter().println( " <tr>"+
        " <td> </br>" + produto.getNome()+
         " </td>" +
         " <td> </br>" + produto.getPreco()+
         " <td> </br>" + produto.getEstoque()+
         " <td> </br>" + produto.getDescricao()+
         " </td>"+
         "<td> <a><button type=submit  value=submit >Adicionar ao carrinho</button>" +
         "                </a></td>" +
        "</tr>");

        response.getWriter().println( " <tr>"+
        " <td> </br>" + produto1.getNome()+
         " </td>" +
         " <td> </br>" + produto1.getPreco()+
         " <td> </br>" + produto1.getEstoque()+
         " <td> </br>" + produto1.getDescricao()+
         " </td>"+
         "<td> <a><button type=submit  value=submit >Adicionar ao carrinho</button>  " +
         "                </a></td>" +
        "</tr>");
        response.getWriter().println( " <tr>"+
        " <td> </br>" + produto2.getNome()+
         " </td>" +
         " <td> </br>" + produto2.getPreco()+
         " <td> </br>" + produto2.getEstoque()+
         " <td> </br>" + produto2.getDescricao()+
         " </td>"+
         "<td> <a><button type=submit  value=submit >Adicionar ao carrinho</button>  " +
         "                </a></td>" +
        "</tr>");
        
        response.getWriter().println( " <tr>"+
         "<td> </br> <a href = /verCarrinho><button type=submit  value=submit >Ver Carrinho</button>  " +
         "                </a></td>" +
        "</tr>");
       
}}



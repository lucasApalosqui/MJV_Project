## Collections java "MAP"

Os objetos "MAP" funcionam assim como seu nome, mapeando uma grande quantidade de dados e transformando a mesma em uma pequena quantidade de informações através de um algoritimo hash(hash code), buscando estas informações com a construção de indices chave.

De forma exemplificada podemos observar a seguir uma lista telefonica onde o indice seria o nome daa pessoa e então conseguiriamos encontrar o número especifico de forma mais simples e direta.
<p align="center">
  <img width="460" height="300" src="https://user-images.githubusercontent.com/70145530/123984464-06ab9b00-d99b-11eb-9ffa-67c0329a1941.png">
</p>

Dessa forma a collection MAP se torna uma ótima escolha caso queira pesquisar, excluir ou alterar elementos com base em suas chaves.

## Interface do MAP JAVA
Assim como dito anteriormente a interface MAP mapeia valores para chaves, porém vale ressaltar que as chaves devem ser únicas diferente dos valores que podem ser repetidos a qualquer momento, mas caso exista uma chave já existente a última chamada sobrescreve a anterior.A interface também faz parte do pacote java.útil e não possui métodos da interface collection.
  Podemos ver a seguir HIERARQUIA da interface e quais classes podem ser implementadas por ela:
  
  <p align="center">
  <img width="460" height="300" src="https://user-images.githubusercontent.com/70145530/123987286-6efb7c00-d99d-11eb-855a-cbf29ef801fc.png">
</p>

### Sintaxe - "Map<E> mapa = new Type();"
  * E - objeto a ser declarado, pode ser uma class Wrapper ou um tipo de coleção;
  * Type - tipo do objeto da coleção que será utilizado;
  
  ### Exemplo de utilização da interface MAP
  
 <p align="center">
  <img width="600" height="450" src="https://user-images.githubusercontent.com/70145530/123994153-7aea3c80-d9a3-11eb-8506-5290d351966e.png">
</p>

 Como podemos ver no exemplo acima, tentamos mapear um valor diferente a uma mesma chave,então apenas o último valor que foi adicionado referenciando a mesma em questão foi exibido.
 
## Classe HashMap
  É a classe de implementação do MAP mais utilizada pelos desenvolvedores.
  
  ### Principais Caracteristicas
  * Não é ordenada;
  * Possui agilidade na busca e inserção de dados;
  * Permite inserir valores e chaves nulas;
  
  ### Métodos Úteis
  Temos diversos métodos que podem ser utilizados por esta classe, como podemos ver no seguinte link (http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html) porém acho válido citar alguns dos mais utilizados;
  
  * values() - Uma collection com todos os valores que foram associados a uma chave especifica;
  * keySet() - retorna um set com as chaves relacionadas;
  * entrySet() - retorna um conjunto de maps contido no mapa, permitindo acesso as suas chaves e valores;
  * put - associa um valor a uma chave;
  * set() - converter um mapa em um conjunto de dados;
### Exemplo dos métodos listados em uma aplicação:
   <p align="center">
  <img width="600" height="450" src="https://user-images.githubusercontent.com/70145530/124002417-18e20500-d9ac-11eb-8cf0-8531f068e41c.png">
</p>
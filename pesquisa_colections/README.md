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
  É a classe de implementação do MAP mais utilizada pelos desenvolvedores;
  
   ### hierárquia classe HashMap
   <p align="center">
  <img width="460" height="300" src="https://user-images.githubusercontent.com/70145530/124380006-cb59e680-dc90-11eb-8056-baf084f0dc59.png">
</p>
  
  ### Principais Caracteristicas
  * Não é ordenada;
  * Possui agilidade na busca e inserção de dados;
  * Permite inserir valores e chaves nulas;
  * colisões podem correr com facilidade;
  
  ### Construtores
  * HashMap() - o construtor padrão que cria uma instância de HashMap com capacidade inicial de 16 e fator de carga de 0,75;
  
  ![image](https://user-images.githubusercontent.com/70145530/124380416-e2013d00-dc92-11eb-80a6-a032604b585e.png)
  
  * HashMap(int InitialCapacity) - cria uma instância de HashMap com capacidade inicial especificada e fator de carga de 0,75.
  
  ![image](https://user-images.githubusercontent.com/70145530/124380514-550ab380-dc93-11eb-8983-e1e20181c508.png)
  
  * HashMap(int InitialCapacity, Float LoadFactor) - cria uma instância de HashMap com capacidade inicial e fator de carga especificado.
  
  ![image](https://user-images.githubusercontent.com/70145530/124380577-c9dded80-dc93-11eb-9268-f710954827a4.png)
  
  * HasMap(Map map) - cria uma instância de HashMap com os mesmos mapeamentos do mapa especificado.
  
  ![image](https://user-images.githubusercontent.com/70145530/124380649-30630b80-dc94-11eb-96f6-f22efab6d89c.png)




  
  ### Métodos Úteis
 Vemos agora os métodos mais utilizados em aplicações HashMap, sendo eles:
  
  * values() - Uma collection com todos os valores que foram associados a uma chave especifica;
  * keySet() - retorna um set com as chaves relacionadas;
  * entrySet() - retorna um conjunto de maps contido no mapa, permitindo acesso as suas chaves e valores;
  * put - associa um valor a uma chave;
  * set() - converter um mapa em um conjunto de dados;
### Exemplo dos métodos listados em uma aplicação:
   <p align="center">
  <img width="600" height="450" src="https://user-images.githubusercontent.com/70145530/124002417-18e20500-d9ac-11eb-8cf0-8531f068e41c.png">
</p>
  
### Outros métodos compátiveis com a classe HashMap e seus exemplos
  * Size() - retorna a quantidade de objetos presentes em um map;
  
    ![image](https://user-images.githubusercontent.com/70145530/124375161-123ae280-dc77-11eb-8d41-c28d009efb0d.png)
  
  resultado:
  
  ![image](https://user-images.githubusercontent.com/70145530/124375172-1ebf3b00-dc77-11eb-8afc-9c5508bbdb71.png)
  -----------------------------------------------------------------------
  
  * isEmpty() - retorna um valor booleano dependendo se um mapa estiver vazio ou não;
  
    ![image](https://user-images.githubusercontent.com/70145530/124375296-ebc97700-dc77-11eb-9138-d03a669adae3.png)
  
  resultado:
  
  ![image](https://user-images.githubusercontent.com/70145530/124375397-5d092a00-dc78-11eb-885a-e531c30cc954.png)
  -----------------------------------------------------------------------
  
  * containsKey() - espera um parametro de qualquer tipo, checa a existencia de uma key com o valor mencionado e retorna um valor boolean;
  
    ![image](https://user-images.githubusercontent.com/70145530/124375576-56c77d80-dc79-11eb-861e-318267d89e0c.png)
  
 resultado:
  
 ![image](https://user-images.githubusercontent.com/70145530/124375607-78286980-dc79-11eb-8363-5ec46ef340de.png)
  -----------------------------------------------------------------------
  
  * putAll() - espera um map como parametro e então copia todos os seus valores;
  
    ![image](https://user-images.githubusercontent.com/70145530/124375836-7d39e880-dc7a-11eb-94d9-e357fee25d31.png)
  
 resultado:
 
 ![image](https://user-images.githubusercontent.com/70145530/124375956-0e10c400-dc7b-11eb-81ac-ff0c46ddf4b9.png)
  -----------------------------------------------------------------------
  
  * remove() - remove um valor presente no map através da key;
  
    ![image](https://user-images.githubusercontent.com/70145530/124376008-40babc80-dc7b-11eb-98b7-390a0fd81392.png)
 
 resultado:
  
 ![image](https://user-images.githubusercontent.com/70145530/124376054-72338800-dc7b-11eb-9272-4c7d75407e64.png)
  -----------------------------------------------------------------------
  
  * clear() - remove todos os valores e keys presentes em um map;
  
    ![image](https://user-images.githubusercontent.com/70145530/124376098-aeff7f00-dc7b-11eb-9d2c-83ff3fcdcb5f.png)
  
 resultado:
  
 ![image](https://user-images.githubusercontent.com/70145530/124376135-dbb39680-dc7b-11eb-94e5-cd873377b405.png)
  -----------------------------------------------------------------------
  
  * containsValue() - espera um valor como parametro e então verifica se o mesmo esta presente no map, retornando um valor boolean;
  
    ![image](https://user-images.githubusercontent.com/70145530/124376221-41a01e00-dc7c-11eb-8f53-9ef06ee78919.png)
 
 resultado:
  
![image](https://user-images.githubusercontent.com/70145530/124375607-78286980-dc79-11eb-8363-5ec46ef340de.png)
  -----------------------------------------------------------------------
  
  * clone() - cria uma cópia superficial de um map;
  
    ![image](https://user-images.githubusercontent.com/70145530/124376449-706ac400-dc7d-11eb-813d-be36844b8c77.png)
 
 resultado:
  
 ![image](https://user-images.githubusercontent.com/70145530/124376510-ac058e00-dc7d-11eb-905b-23c6079e2462.png)
  -----------------------------------------------------------------------
  
 
  ## Classe HashTable
  Bem parecido com a classe HashMap em funcionamento, porém com algumas peculiaridades únicas em sua excecução, conheceremos um pouco delas a seguir;
  
   ### hierárquia classe HashTable
   <p align="center">
  <img width="460" height="300" src="https://user-images.githubusercontent.com/70145530/124379757-36a2b900-dc8f-11eb-9516-56b99408c257.png">
</p>
  
  ### principais caracteristicas:
  * É sincronizada;
  * Não permite valores ou chaves nulas;
  * objetos utilizados como chave devem implementar o método hashCode e o método equals;
  * A capacidade(é o número de budgets na tabela hash) padrão é de 11 enquanto o loadFactor(capacidade inicial no momento em que a tabela é criada) sendo 0.75;
  * Sistema de pesquisa mais lento, porém atráves de arrays lists chances de possiveis colisões são reduzidas;
  
  ### construtores
  * HashTable() - cria uma tabela de hash vazia com o fator de carga padrão de 0,75 e uma capacidade inicial de 11.
  
  ![image](https://user-images.githubusercontent.com/70145530/124380812-4c1ae180-dc95-11eb-862f-be7968d1bddf.png)
  
  * HashTable(int initialCapacity) - cria uma tabela hash que tem um tamanho inicial especificado por initialCapacity e o fator de carga padrão é 0,75.
  
  ![image](https://user-images.githubusercontent.com/70145530/124380858-87b5ab80-dc95-11eb-8248-307a3b0cd72f.png)
  
  * HashTable(int size, float fillRatio) - cria uma tabela hash que tem um tamanho inicial especificado por tamanho e taxa de preenchimento especificada por fillRatio.
  
  ![image](https://user-images.githubusercontent.com/70145530/124380952-3f4abd80-dc96-11eb-98ee-a22509780a62.png)
  
  * HashTable(Map<? extends K,? extends V> m) - cria uma tabela hash que é inicializada com os elementos em m.

  ![image](https://user-images.githubusercontent.com/70145530/124381145-49b98700-dc97-11eb-997b-8172d4ca3898.png)
  
  ### métodos úteis
  alguns métodos presentes em HashTable já exploramos e visitamos suas funcionalidades na classe HashMap, sendo eles:
  
  * clear()
  * clone()
  * containsKey()
  * containsValue()
  * contains()
  * entrySet()
  * get()
  * isEmpty()
  * keySet()
  * put()
  * remove()
  * size()
  * values()

  ### Outros métodos compátiveis com a classe HashTable e seus exemplos
  
  * compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction) - calcula um mapeamento atraves da key e permite alterar seu valor;

  ![image](https://user-images.githubusercontent.com/70145530/124381850-f47f7480-dc9a-11eb-9537-ed97b238b734.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124381959-72438000-dc9b-11eb-912a-22e45399229b.png)
-----------------------------------------------------------------------

  * computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction) - se a chave especificada não estiver associada a algum valor, cria e adiciona na HashTable a não ser que seja nulo;

  ![image](https://user-images.githubusercontent.com/70145530/124382168-6ad0a680-dc9c-11eb-8fce-23acfc0f21b8.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124382232-b6835000-dc9c-11eb-9651-9357698490c1.png)
-----------------------------------------------------------------------

  * computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction) - Se o valor da chave especificada estiver presente e não for nulo, tenta calcular um novo mapeamento com base na chave e seu valor mapeado atual.

  ![image](https://user-images.githubusercontent.com/70145530/124382419-bb94cf00-dc9d-11eb-8c89-38c49776facd.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124382431-c5b6cd80-dc9d-11eb-8c22-2e3725b885d9.png)
-----------------------------------------------------------------------

  * elements() - retorna uma enumeração dos valores na tabela

  ![image](https://user-images.githubusercontent.com/70145530/124382783-8b4e3000-dc9f-11eb-9f4b-9480bac0c9e6.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124382812-a456e100-dc9f-11eb-92ae-a7653776503d.png)
-----------------------------------------------------------------------

  * equals() - compara dois mapas e retorna um valor boolean;

  ![image](https://user-images.githubusercontent.com/70145530/124382961-673f1e80-dca0-11eb-9965-340b9504a753.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124382973-72924a00-dca0-11eb-9bd4-dc404151a67b.png)
-----------------------------------------------------------------------

  * merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction) - Se a chave especificada ainda não estiver associada a um valor ou estiver associada a nulo, associa-a ao valor não nulo fornecido;

  ![image](https://user-images.githubusercontent.com/70145530/124383554-783d5f00-dca3-11eb-9bb3-974b81d84901.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124383570-93a86a00-dca3-11eb-8746-c3d5e0fdb91d.png)
-----------------------------------------------------------------------

  * toString() - transforma o hashTable em String;

  ![image](https://user-images.githubusercontent.com/70145530/124383616-cd797080-dca3-11eb-974a-92abe18db711.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124383623-d8340580-dca3-11eb-913e-fc369faf772c.png)
-----------------------------------------------------------------------

## classe TreeMap

Implementação de mapa onde suas entradas são classificadas de acordo com a ordem de suas chaves ou através de um comparador fornecido na construção;

### hierárquia classe TreeMap

 <p align="center">
  <img width="460" height="300" src="https://user-images.githubusercontent.com/70145530/124383966-a7ed6680-dca5-11eb-9190-8c4bbbdd03c1.png">
</p>

### principais caracteristicas:

* Ele implementa a interface NavigableMap e estende a classe AbstractMap;
* contém apenas elementos exclusivos;
* não pode ter uma chave nula, mas pode ter vários valores nulos;
* não é sincronizado;
* mantém a ordem crescente;

### construtores

* treeMap() - construir um mapa de árvore vazio que será classificado usando a ordem natural de suas chaves;

![image](https://user-images.githubusercontent.com/70145530/124384499-e8e67a80-dca7-11eb-9027-4e9b2122bbb2.png)

* TreeMap(Comparator comp) - usado para construir um objeto TreeMap vazio no qual os elementos precisarão de uma especificação externa da ordem de classificação;

![image](https://user-images.githubusercontent.com/70145530/124386122-30243980-dcaf-11eb-8c45-8ead65cf208a.png)

![image](https://user-images.githubusercontent.com/70145530/124386136-48945400-dcaf-11eb-9939-f6efbde09045.png)

![image](https://user-images.githubusercontent.com/70145530/124386140-534ee900-dcaf-11eb-9cdf-83a6237117b2.png)

* TreeMap(Map M) - usado para inicializar um TreeMap com as entradas do mapa M fornecido, que será classificado usando a ordem natural das chaves;

![image](https://user-images.githubusercontent.com/70145530/124386432-c9078480-dcb0-11eb-9341-fb3178957245.png)

* TreeMap(SortedMap sm) - usado para inicializar um TreeMap com as entradas do mapa classificado fornecido, que será armazenado na mesma ordem do mapa classificado fornecido

![image](https://user-images.githubusercontent.com/70145530/124386747-3536b800-dcb2-11eb-9013-b5088ea926d8.png)

### métodos úteis

alguns métodos presentes em HashTable já exploramos e visitamos suas funcionalidades na classe HashMap e HashTable, sendo eles:

* clear()
* clone()
* containsKey()
* containsValue()
* entrySet()
* get()
* keySet()
* put()
* putAll()
* remove()
* size()
* values()

  ### Outros métodos compátiveis com a classe HashTable e seus exemplos

   * firstKey() - retorna a primeira chave (mais baixa) atualmente neste mapa classificado;

   ![image](https://user-images.githubusercontent.com/70145530/124387202-fc97de00-dcb3-11eb-8daf-884b7865df2a.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124387245-1e916080-dcb4-11eb-9eb4-db17fd74fb0b.png)
-----------------------------------------------------------------------

   * headMap(Object key_value) - O método retorna uma visualização da parte do mapa estritamente menor que o parâmetro key_value;

   ![image](https://user-images.githubusercontent.com/70145530/124387458-2bfb1a80-dcb5-11eb-87c9-0dfc07700b69.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124387474-3b7a6380-dcb5-11eb-957a-450705e1b470.png)
-----------------------------------------------------------------------

   * lastKey() - Retorna a última chave (mais alta) atualmente neste mapa classificado;

   ![image](https://user-images.githubusercontent.com/70145530/124387572-86947680-dcb5-11eb-898e-ec6c907d5b39.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124387590-94e29280-dcb5-11eb-95e6-c56e7c345d3a.png)
-----------------------------------------------------------------------

   * subMap((K startKey, K endKey) - retorna a parte deste mapa cujas chaves variam de startKey, inclusive, a endKey, exclusiva;

   ![image](https://user-images.githubusercontent.com/70145530/124387720-f571cf80-dcb5-11eb-8052-7807d5753350.png)

resultado:

![image](https://user-images.githubusercontent.com/70145530/124387731-fefb3780-dcb5-11eb-88d4-e48a604e785c.png)
-----------------------------------------------------------------------
















































  



  
  



  
  

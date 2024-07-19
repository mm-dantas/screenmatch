# ScreenMatch

**ScreenMatch** é uma aplicação Java projetada para gerenciar e recomendar filmes e séries, utilizando a API OMDb para buscar informações sobre títulos. A aplicação é dividida em várias classes que permitem a adição e análise de filmes e séries, cálculo do tempo total de reprodução e filtragem de recomendações com base em avaliações.

## Funcionalidades

- **Busca de Filmes e Séries**:
  - O usuário pode buscar filmes usando a API OMDb, que retorna informações como título, ano e duração.
  - Os dados obtidos são convertidos e armazenados em objetos da aplicação.

- **Manipulação de Títulos**:
  - A aplicação suporta dois tipos de títulos: Filmes e Séries.
  - Filmes e Séries têm atributos como nome, ano de lançamento e duração.
  - As Séries têm atributos adicionais, como número de temporadas, episódios por temporada e minutos por episódio.

- **Cálculo e Análise**:
  - Calculadora de Tempo: Soma a duração total dos títulos incluídos.
  - Filtro de Recomendação: Avalia e recomenda títulos com base em sua classificação.

- **Persistência de Dados**:
  - Os títulos buscados são armazenados em um arquivo JSON, permitindo salvar e carregar dados posteriormente.

## Estrutura do Projeto

- **PrincipalComBusca**: Classe principal para busca de filmes e armazenamento de resultados.
- **Principal**: Demonstra funcionalidades básicas de filmes e séries, incluindo cálculo de tempo e filtragem de recomendações.
- **PrincipalComListas**: Exemplo de uso de listas e ordenação de títulos.
- **Modelos**: Inclui classes para representar Títulos, Filmes, Séries e Episódios.
- **Calculos**: Contém classes para cálculos de tempo e recomendações.
- **Excecoes**: Define exceções específicas para tratamento de erros de conversão de ano.

## Requisitos

- Java 17 ou superior
- Biblioteca Gson para manipulação de JSON

## Como Usar

1. Execute o arquivo `PrincipalComBusca` para buscar filmes e salvar os resultados em um arquivo `filmes.json`.
2. Use `Principal` para experimentar funcionalidades básicas e visualizar a duração total dos filmes e séries.
3. Utilize `PrincipalComListas` para explorar a ordenação e manipulação de listas de títulos.

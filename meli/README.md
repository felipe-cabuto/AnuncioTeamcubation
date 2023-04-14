# Contador de visualização de anúncios

Incluir endpoine de delete dos Anuncio

Criar a entidade, repository, service e controller para Visualizacao

Testes de Exceções:

1. Não pode haver anúncio com o nome vazio ou nulo:
- Criar BlankNameException (exceção não checada) e lançá-la caso o usuário tente fazer com que um anúncio
  tenha nome vazio ou nulo na criação ou na atualização de algum anúncio.
- Esta exceção deve retornar Http Status Bad Request.

2. Não pode haver dois anúncios com o mesmo nome:
- Criar UniqueViolatedException (exceção não checada) e lançá-la caso o usuário tente fazer com que dois anúncios
  tenham nomes duplicados na criação ou na atualização de algum anúncio.
- Esta exceção deve retornar Http Status Conflict.

3. Não pode haver anúncio com expressões inválidas no nome
- Criar InvalidWordException (exceção não checada) e lançá-la caso o usuário tente criar ou atualizar um anúncio que
  contenha alguma expressão inválida, independente de qualquer das letras estarem maíusculas ou minúsculas.
- Lista de expressões inválidas: "Amazon", "Magalu", "Americanas".
- Esta exceção deve retornar Http Status Bad Request.

4. Não pode haver anúncio com preços inválidos
- Criar duas propriedades double no Anúncio (PrecoBase e PrecoPromocional).
- Todos os anúncios devem ter o preço base e o preço promocional maiores do que zero. Caso o usuário tente
  criar ou atualizar anúncios infringindo essa regra (ou enviando nulo), deve ser lançado InvalidPriceException 
  (exceção não checada), indicando para o usuário se é o preço base, se é o preço promocional, ou se são ambos os preços
  que estão inválidos. Esta exceção deve retornar Http Status Bad Request.
- Todos os anúncios devem ter o preço promocional igual ou menor ao preço base. Caso o usuário tente
  criar ou atualizar anúncios infringindo essa regra, deve ser lançado InvalidPromotionException (exceção não checada).
  Esta exceção deve retornar Http Status Bad Request.

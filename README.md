# Fiap Aula Teste
Projeto para colocar em prática os conceitos abordados na apresentação.

## Tema Abordado
[Coroutines](https://docs.google.com/presentation/d/1ulPO9nMRkBTW0fJb7CWlqsG7NzzGmImDJCyEu2_3_x8/edit#slide=id.p)

## Objetivo do Projeto
Com o que foi explicado sobre coroutines ajustar o app fazendo com que o Relógio funcione.
Importante não travar a Main thread e ter o mesmo resultado que o gif abaixo:

![](/resources/timer.gif)

## Use Case
```
object GetTimeUseCase {
   private val timerFormat: SimpleDateFormat by lazy {
       SimpleDateFormat("HH:mm:ss", Locale.getDefault())
   }

   suspend operator fun invoke() : String {
       return withContext(Dispatchers.Default) {
           val millis = System.currentTimeMillis()
           timerFormat.format(millis)
       }
   }
}
```

## Extra
Adicionar caso de teste.

## Apache 2.0 License
[![License](https://img.shields.io/badge/License-Apache_2.0-yellowgreen.svg)](https://opensource.org/licenses/Apache-2.0)
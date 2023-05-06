<h1 align="center">MVVM_Estudo</h1>

<p align="center">
  <br>
  <a href="https://www.linkedin.com/in/williasjunior/"><img alt="Linkedin" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/></a>
</p>

<p align="center">  

⭐ Esse é um projeto que foi criado no intuito de aprender mais sobre a arquitetura MVVM (View - ViewModel - Model), o aplicativo foi criado seguindo os passos da live do Kaique Ocanha (https://www.youtube.com/live/Gf5VEBQQzrk?feature=share).

</p>

</br>

<p float="left" align="center">
<img alt="screenshot" width="30%" src="screenshots/screenshots-1.jpeg"/>
<img alt="screenshot" width="30%" src="screenshots/screenshots-1.jpeg"/>
<img alt="screenshot" width="30%" src="screenshots/screenshots-1.jpeg"/>
</p>

## Download

Ou faça o download da <a href="apk/app-debug.apk?raw=true">APK diretamente</a>. Você pode ver <a href="https://www.google.com/search?q=como+instalar+um+apk+no+android">aqui</a> como instalar uma APK no seu aparelho android.

## Tecnologias usadas e bibliotecas de código aberto

- Minimum SDK level 23
- [Linguagem Kotlin](https://kotlinlang.org/)

- Jetpack
  - Lifecycle: Observe os ciclos de vida do Android e manipule os estados da interface do usuário após as alterações do ciclo de vida.
  - ViewModel: Gerencia o detentor de dados relacionados à interface do usuário e o ciclo de vida. Permite que os dados sobrevivam a alterações de configuração, como rotações de tela.
  - ViewBinding: Liga os componentes do XML no Kotlin através de uma classe que garante segurança de tipo e outras vantagens.
  - Room: Biblioteca de abstração do banco de dados SQLite que garante segurança em tempo de compilação e facilidade de uso.
  - Custom Views: View customizadas feitas do zero usando XML.

- Arquitetura - LISTE BREVEMENTE OS COMPONENTES DA SUA ARQUITETURA UTILIZADA
  - MVVM (View - ViewModel - Model)
  - Comunicação da ViewModel com a View através de LiveData
  - Comunicação da ViewModel com a Model através de Kotlin Flow
  - Repositories para abstração da comunidação com a camada de dados.
  
- Bibliotecas - LISTE TODAS AS BIBLIOTECAS USADAS NO PROJETO, COM LINK E DESCRIÇÃO BREVE DO QUE ELA FAZ
  - [Retrofit2 & OkHttp3](https://github.com/square/retrofit): Para realizar requisições seguindo o padrão HTTP.
  - [Glide](https://github.com/bumptech/glide): Para carregamento de imagens e cacheamento das mesmas.
  - [Timber](https://github.com/JakeWharton/timber): Para registros de logs mais amigáveis que facilitam o debug.

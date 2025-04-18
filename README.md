# 📱 Simulador de iPhone - POO em Java

Um projeto didático que imita as funcionalidades básicas de um iPhone (inspirado no 2G), feito para praticar **Programação Orientada a Objetos** e **boas práticas de código**.  
*Ideal para portfólio de iniciantes em Java!*

---

## 🎯 Funcionalidades Principais

### 📞 **Telefone**
- Fazer ligações com simulação de chamada em andamento.
- Atender chamadas recebidas.
- Gerenciar correio de voz com mensagem pré-gravada.

### 🎧 **Reprodutor Musical**
- Tocar músicas (com ou sem artista cadastrado).
- Pausar e selecionar faixas.
- Modelo de dados para músicas (`Musica.java`).

### 🌐 **Navegador Web**
- Abrir páginas via URL.
- Adicionar novas abas.
- Atualizar páginas com animação de carregamento.

---

## 🛠️ Tecnologias e Conceitos
- **Java 17+** (compilação manual sem Maven).
- **Scanner** para interação via terminal.
- **Tratamento de exceções** (`InputMismatchException`).
- **Interfaces especializadas** (Princípio ISP do SOLID).
- **Encapsulamento** (getters/setters controlados).

---

## ⚡ Como Executar

1. **Clone o projeto**:
   ```bash
   git clone https://github.com/luancortes208/iphone2007-project.git
   ```
2. Compile e execute (Java puro):
    ```bash
    javac -d bin src/**/*.java
    java -cp bin App
    ```
3. Siga o menu interativo:
    ```Bash
    1 - Ligação
    2 - Ouvir Música
    3 - Navegar na internet
    ```

---

## 🗂️ Estrutura do Código
src/
├── models/
│   ├── Iphone.java       → Classe principal (implementa todas as funcionalidades)
│   └── Musica.java       → Modelo para músicas
├── interfaces/
│   ├── AparelhoTelefonico.java → Ligar, atender, correio de voz
│   ├── MusicPlayer.java        → Tocar, pausar, selecionar música
│   └── NavegadorInternet.java  → Navegação web
├── Exceptions/           → (Reservado para futuras exceções customizadas, mas possui uma personalizada)
└── App.java              → Application start, rode via terminal ou IDE escolhida

---

## 🔍 Destaques Técnicos
- Simulação de um Iphone.
- Validações

---

Feito com ☕ por Luan Cortes.

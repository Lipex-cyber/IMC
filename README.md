# 📱 Calculadora de IMC — Android

Projeto Android desenvolvido em **Kotlin** para calcular o Índice de Massa Corporal (IMC), com exibição detalhada dos dados utilizados no cálculo.

---

## 📋 Sobre o Projeto

Este projeto é baseado no exercício proposto na disciplina de **Programação de Dispositivos Móveis**, referente à Célula 03 / Bloco 01. O projeto original exibia apenas o valor do IMC na tela de resultado. As modificações solicitadas foram aplicadas conforme a **Figura 6** da atividade.

---

## ✏️ Modificações Realizadas

### 1. Novos campos na tela de resultado
A tela de resultado passou a exibir todas as informações usadas no cálculo:

| Campo | Exemplo |
|---|---|
| Nome | Ramon |
| Classificação | Sobrepeso |
| Seu IMC | 28,23 |
| Seu Peso | 75.0 |
| Sua Altura | 163.0 |

### 2. IMC arredondado para 2 casas decimais
O valor do IMC que antes era exibido com muitas casas decimais (ex: `28.228388`) passou a ser formatado com apenas 2 casas decimais (ex: `28,23`), utilizando:

```kotlin
String.format(Locale("pt", "BR"), "%.2f", imc?.imc ?: 0f)
```

### 3. Alteração de cor dos componentes
A cor principal da interface foi alterada de **roxo** (`#5D1049`) para **laranja** (`#F5A623`), afetando:
- AppBar (barra superior)
- Botão VOLTAR

A alteração foi feita no arquivo `colors.xml`:

```xml
<color name="colorPrimary">#F5A623</color>
```

---

## 🗂️ Arquivos Modificados

```
app/src/main/
├── java/com/example/imc/
│   └── ResultadoActivity.kt       ← exibe peso, altura e IMC formatado
├── res/
│   ├── layout/
│   │   └── activity_resultado2.xml  ← adicionados textViewPeso e textViewAltura
│   └── values/
│       └── colors.xml               ← cor alterada para laranja #F5A623
```

---

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/Lipex-cyber/IMC.git
```

2. Abra no **Android Studio**

3. Aguarde o **Gradle** sincronizar

4. Clique em **Run ▶** ou pressione `Shift + F10`

> **Requisito:** JDK 11 configurado no Gradle (File → Settings → Build Tools → Gradle → Gradle JVM)

---

## 📸 Telas

| Tela de Entrada | Tela de Resultado |
|---|---|
| Campos: Nome, Peso, Altura | Exibe: Nome, Classificação, IMC, Peso e Altura |
| Botão AVALIAR | Botão VOLTAR |

---

## 🛠️ Tecnologias

- **Linguagem:** Kotlin
- **IDE:** Android Studio
- **Min SDK:** API 21 (Android 5.0)
- **Gradle:** 5.6.4

---

## 👤 Autor

Desenvolvido por **Felipe** — Disciplina de Programação de Dispositivos Móveis

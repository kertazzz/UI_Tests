# Проект по автоматизации тестирования сайта globalsqa.com

<br>
<p align="center">
<img width="60%" title="GlobalSQA" src="images/logos/globalsqa.png">
</p>
<br>

## Содержание:

- [Использованный стек технологий](#Использованный-стек-технологий)
- [Реализованные проверки](#Реализованные-проверки)
- [Запуск тестов](#запуск-тестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Деплой и запуск теста в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

##  Использованный стек технологий

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logos/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logos/Java.svg">
<img width="6%" title="Selenide" src="images/logos/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logos/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logos/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logos/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logos/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logos/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logos/Jenkins.svg">
</p>

Автотесты написаны на <code>Java</code> с использованием <code>JUnit 5</code> и <code>Gradle</code>.
Для UI-тестов использован фреймворк [Selenide](https://selenide.org/).
Запуск тестов можно осуществлять локально или с помощью [Selenoid](https://aerokube.com/selenoid/).
Также реализована сборка в <code>Jenkins</code> с формированием Allure-отчета.

Allure-отчет включает в себя:
* шаги выполнения тестов;
* скриншот страницы в браузере в момент окончания автотеста;
* Page Source;
* логи браузерной консоли;


## Реализованные проверки

- [x] *Проверка формы регистрации с популярными типами полей использующихся для ввода данных.*
- [x] *Проверка и оптимальное покрытие всех обязательных параметров регистрации используя методику Pairwise testing с помощью сгенерированного CSV data-provider.*
- [x] *Проверка соответствия входных данных с результативной формой.*


## Запуск тестов

### Локальный запуск тестов
```
gradle clean test -Denv=local
```

При необходимости можно переопределить параметры запуска
```
test/smoke/regress - запуск всех тестов/только smoke/только regress

```

### Запуск тестов на удаленном браузере
```
gradle clean test -Denv=remote
```
При необходимости также можно переопределить параметры запуска

```
test/smoke/regress - запуск всех тестов/только smoke/только regress
```

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="images/logos/Jenkins.svg"> Сборка в Jenkins
<p align="center">
<img title="Jenkins Build" src="images/scr/Jenkins.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="images/logos/Allure_Report.svg"> Пример Allure-отчета
### Overview

<p align="center">
<img title="Allure Overview" src="images/scr/allureReportMain.png">
</p>

### Результат тестов

<p align="center">
<img title="Test Results in Alure" src="images/scr/allureReportTests.png">
</p>

### <img width="4%" style="vertical-align:middle" title="Selenoid" src="images/logos/Selenoid.svg"> Видео примера запуска теста в Selenoid

Для каждого прогона тестов пишется  видео и доступен VNC, как на гифке.
<p align="center">
  <img title="Selenoid Video" src="images/gif/21-51-18.gif">
</p>

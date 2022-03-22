![header](https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6&height=200&section=header&text=Проект%20по%20&fontAlignY=35&fontSize=60&desc=%20тестировани%20сайта%20GitHub&descAlignY=60&descSize=50&animation=twinkling&fontColor=E9E9E9F3&descAlign=60&fontAlign=35)

<p align="center">
  <img title="|Customized by Albina Masgutova|" src="https://readme-typing-svg.herokuapp.com?color=fe9ac5&font=Knewave&size=35&center=true&vCenter=true&lines=Albina+Masgutova;QA+engineer">
</p>

## :cherry_blossom:	Содержание

> ➠ [Покрытый функционал](#fire-покрытый-функционал)
>
> ➠ [Технологический стек](#fleur_de_lis-технологический-стек)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов в Jenkins](#robot-удаленный-запуск-тестов)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#skier-главная-страница-allure-отчета)
>
> ➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
>
> ➠ [Пример запуска теста в Selenoid](#-пример-запуска-теста-в-selenoid



## :fire: Покрытый функционал

#  UI

:star_of_david: Проверка поисковой строки

:star_of_david: Проверка перехода на страницу Team

:star_of_david: Проверка отображения ошибки, если ввели неверный email

## :fleur_de_lis: Технологический стек

<p align="center">
  <img width="60" title="customized by daramirra" src="https://img.shields.io/badge/-Java-20793B?logo=java&style=for-the-badge">
  <img width="72" title="customized by daramirra" src="https://img.shields.io/badge/-Selenide-6A54DF?&style=for-the-badge">
  <img width="73" title="customized by daramirra" src="https://img.shields.io/badge/-Selenoid-20793B?&style=for-the-badge">
  <img width="75" title="customized by daramirra" src="https://img.shields.io/badge/-Gradle-6A54DF?logo=gradle&style=for-the-badge">
  <img width="80" title="customized by daramirra" src="https://img.shields.io/badge/-Jenkins-20793B?logo=Jenkins&style=for-the-badge&logoColor=white">
  <img width="74" title="customized by daramirra" src="https://img.shields.io/badge/-JUnit'5-6A54DF?logo=junit5&style=for-the-badge&logoColor=white">
  <img width="105" title="customized by daramirra" src="https://img.shields.io/badge/-Allure Report-20793B?&style=for-the-badge">
  <img width="110" title="customized by daramirra" src="https://img.shields.io/badge/-Allure TestOps-6A54DF?&style=for-the-badge">
  <img width="125" title="customized by daramirra" src="https://img.shields.io/badge/-Telegram%20(Bot)-20793B?logo=Telegram&style=for-the-badge">
</p>

# Запуск тестов из терминала
В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.


## Запуск тестов из терминала

### :robot: Локальный запуск тестов

```
gradle clean test
```

### :robot: Удаленный запуск тестов 

```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### :robot: Параметры сборки

> <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>
> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).



### :skier: Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screens/Allure Report - Overview.jpg">
</p>

### :eye_speech_bubble: Группировка тестов по проверяемому функционалу

<p align="center">
<img title="Allure Behaviors" src="images/screens/Allure Report - Google Chrome.jpg">
</p>


### :frog: Основной дашборд

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/Allure Report -graph.jpg">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.

<p align="center">
<img title="Telegram Notifications" src="images/screens/Telegram.jpg">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Пример запуска теста в Selenoid

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/7ff5aa94166727e.mp4">
</p>



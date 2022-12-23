# Ссылки на документацию и инструменты по OPEN-API

## Хороший источник по API: https://starkovden.github.io/about-fourth-module.html

официальная спецификация <https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.1.0.md>

от Swagger: <https://swagger.io/docs/specification/about/>

инструменты: <https://openapi.tools/#gui-editors>

графическое описание схемы API-документа <http://out.newarmenia.net/mindmap/OpenAPI.html>

описание на хабре: <https://habr.com/ru/post/705698/>

еще описание: <https://starkovden.github.io/introduction-openapi-and-swagger.html>

Rustem Abubakirov, [18.12.2022 22:09]
схема API-документа <http://out.newarmenia.net/mindmap/OpenAPI.html>

Расширения в VisualStudio:

По нашей теме Visual Studio Code требует установки расширений openapi-designer, openapi-lint и YAML.

На примере расширения openapi-designer, которое отвечает за визуальное представление кода, покажем как расширение устанавливать и вызывать на действие:

Устанавливать:
вызвать панель расширений по нижней кнопке слева или при помощи горячих клавиш Ctrl+Shift+X;
в строке поиска набить "openapi";
в списке найденных по контексту возможных для установки расширений найти openapi-designer и нажать кнопку Install в его блоке;
после установки перегрузить программу (можно по кнопке Reload requered).
Вызывать:
открыть YAML файл в нотификации OpenAPI;
вызвать панель расширений сочетанием горячих клавиш Ctrl+Shift+P;
в поисковой строке набрать "openapi", чтобы отобрать в списке расширения по контексту;
выбрать OpenAPI Designer: Preview;
в правой половине экрана откроется окно с визуализацией кода.
При следующих вызовах Ctrl+Shift+P нужная команда будет уже на первом месте в списке.

# Документирование и автогенерация по аннотациям в коде Java

<https://struchkov.dev/blog/api-swagger/#настраиваем-swagger>

<https://russianblogs.com/article/85861668917/>

<https://translated.turbopages.org/proxy_u/en-ru.ru.7a55c32a-639f50e9-12d5876a-74722d776562/https/www.baeldung.com/swagger-set-example-description>

<https://coderlessons.com/articles/java/spring-rest-api-s-swagger-sozdanie-dokumentatsii>

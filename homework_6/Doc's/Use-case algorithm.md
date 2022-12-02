# Алгоритм разработки диаграммы прецедентов использования

## 1. Определить предметную область

Предметная область — это часть реального мира, данные и особенности которой будут отражены в разрабатываемом программном решении. Например, в качестве предметной области можно выбрать бухгалтерию какого-либо предприятия, отдел кадров, банк, магазин и т. д. Предметная область бесконечна и содержит как важные понятия и данные, так и малозначащие или вообще ничего не значащие данные. Так, если в качестве предметной области выбрать учет товаров на складе, то понятия «накладная» и «счет-фактура» являются важными, а то, что сотрудница, принимающая накладные, имеет двоих детей — это для учета товаров неважно. Однако с точки зрения отдела кадров данные о наличии детей являются важными. Таким образом, значимость данных зависит от выбора предметной области.

Что значит определить предметную область?

Это значит, что нужно мысленно очертить границу значимых параметров и свойств, в какой-либо конкретной области деятельности человека.

## 2. Выделить значимые данные

Выделить значимые данные, значит определить, в рамках выбранной предметной области:

1. важные действующие роли (т.е. акторов, в терминологии use-case диаграмм);
2. для каждой роли определить важные действия, которые они могут совершать;

## 3. Разместить на диаграмме акторов и прецеденты использования

1. Отобразить поле диаграммы.
2. Разместить основных пользователей (групп пользователей) на диаграмме.
3. Разместить в границах поля варианты (прецеденты) использования.

## 4. Разграничить прецеденты на диаграмме между акторами, разместить отношения

1. Отношение ассоциации — отражает возможность использования актером прецедента

2. Отношение включения — поведение одного прецедента включается в другой в качестве составного, причем дополняемый вариант использования не сможет выполняться без основного

3. Отношение расширения — отражает возможное присоединение одного использования к другому, при этом расширяющий вариант использования выполняется лишь при определенных условиях и не является обязательным для выполнения основного прецедента

![Изображение use-case connections](/Use-case%20connections.png)
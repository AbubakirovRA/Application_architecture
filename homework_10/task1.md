Необходимо спроектировать

h. Спроектировать компонент подключения по API к производителю роботов-пылесосов, для обновления прошивок и передачи диагностических данных https://app.diagrams.net/.

Клиент - робот-пылесос
Робот имеет микропрограмму, при включении запускается тест самодиагностики, который проверяет исправность всех подсистем. Далее передается управление загрузчику операционной системы робота-пылесоса. Который загружает операционную систему. Операционная система управляет функциями пылесоса, в числе которой есть функция обновления прошивки (микропрограммы) пылесоса. Данная функция может запускаться по расписанию по умолчанию, через периоды установленные производителем, либо через периоды установленные пользователем, либо быть им отключена.

Соответственно, данная функция также должна иметь интерфейс для взаимодействия с пользователем - через веб-интерфейс личного кабинета.

При наступлении времени обновления, данная функция проверяет номер прошивки пылесоса, формирует REST запрос на сервер, в котором запрашивает версию последней прошивки,

GET https://GreatServerOfPylesos.com/firmware/last_version
{
    Accept:application/json
}

сверяет с текущей и, в случае если требуется обновление, отправляет Get-запрос на скачивание файла прошивки. После скачивания, запускает процедуру установки программного обеспечения.

GET https://GreatServerOfPylesos.com/firmware/last_version
{
    application/octet-stream
}

В случае наступления ошибки или сбоя в работе пылесос отправляет POST-сообщение с данными диагностики.

POST https://GreatServerOfPylesos.com/client10001/mistakes
{
    "mistakeNumber" : "234"
    "pylesos" : "Pylesos",
    "date" : "__.__.___",
    "exception" : "String_number"
}


Сервер - сервер производителя


i. Спроектировать адаптеры интерфейсов в виде компонент (подключение к БД, шлюзы к интерфейсу, шлюзы к третьим источникам) https://app.diagrams.net/.

j. Спроектировать компонент внешнего конфигурирования для настройки компонент бизнес-логики (параметры конкретного робота) https://app.diagrams.net/.

k. Спроектировать и имплементировать компонент самодиагностики (Self-checking). Который собирает статус работоспоспособности и времени запроса на каждый компонент уровня API Gateway, бизнес-логики и слоя управления данными. Включая технологический интерфейс для мониторинга https://grafana.com/ или https://prometheus.io/

l. Выбрать метрики для наблюдения за инфраструктурой на которой будет развёрнуто решение (процессор, память, диск).
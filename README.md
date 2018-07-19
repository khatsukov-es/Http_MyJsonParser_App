# Http_MyJsonParser_App
Простая HTTP-база данных.

При реализации запрещено пользоваться HTTPUrlConnection

Требования:

Однопоточная реализация. Задачи поддерживать множественные входящие соединения не стоит.
Все настройки указаны в property файле.
Путь к property файлу передаётся при запуске, либо берётся файл по умолчанию.
Сервер стартует и слушает порт, указанный в настройках
При получении входящего HTTP-запроса, обрабатывает его:
/user/create?name=XXX&age=YYY&salary=ZZZ
Принимает запрос на создание пользователя
Создаёт по параметрам обьект пользователя
ID - первый свободный идентификатор в папке. Сканируем папку пофайлово и выбираем первый свободный ID.
Сохраняет обьект в файл. Директория - папка указанная в настройках. Имя файла - ${id}.bin. Для сохранения используется стандартная сериализация.
В ответ записывается ID созданного пользователя.
Ответ должен быть валидным HTTP-ответом.
/user/delete/id
Удаляет пользователя.
Если пользователя нет - код HTTP-возврата 404. Если есть - 200.
Ответ должен быть валидным HTTP-ответом.
/user/list
Возвращается список всех известных пользователей в json-формате.
Ответ должен быть валидным HTTP-ответом.
/user/${id}
Возвращается пользователя в json-формате.
Если пользователя нет - код HTTP-возврата 404. Если есть - 200.
Ответ должен быть валидным HTTP-ответом.
Решение должно уметь обрабатывать запросы от стандартного браузера.

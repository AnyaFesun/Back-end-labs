# Лабораторна робота №2: "Розробка базового REST API"

### Виконала: Фесун Анна Валеріївна ІМ-21

## Інструкції для запуску проекту:

1. Переконайтеся, що у вас встановлено Docker та Docker Compose.
2. Клонуйте репозиторій на локальний комп'ютер:
   ```bash
   git clone https://github.com/AnyaFesun/Back-end-2.git
   ```
3. Використайте наступну команду для побудови Docker образів:
   ```bash
   docker-compose build
   ```
4. Запустіть контейнери:
   ```bash
   docker-compose up
   ```
5. Після запуску контейнерів ви можете перевірити роботу застосунку,
відкривши веб-браузер і перейшовши за адресою: http://localhost:8080/{endpoint}
Наприклад, для перевірки категорій використайте: http://localhost:8080/category
> **Примітка**: Щоб побачити дані на цих ендпоінтах, спочатку додайте їх, виконавши відповідні POST запити (наприклад, для створення нової категорії або користувача).
6. Щоб зупинити запущені контейнери, використайте:
   ```bash
   docker-compose down
   ```

## Деплоймент
Застосунок успішно деплойнуто на платформі Render.
Ви можете отримати доступ до сервісу за наступним посиланням:
https://back-end-2-0c97.onrender.com
> **Примітка**: Щоб взаємодіяти з різними ендпоінтами, додайте їх до основного шляху. 
> Наприклад, для доступу до користувача з ID `1` використовуйте:
>
> ```
> https://back-end-2-0c97.onrender.com/user/1
> ```
>
> Доступні ендпоінти включають:
> - `/user`
> - `/category`
> - `/record`
>
> Переконайтеся, що дані для кожного ендпоінту було додано через відповідні `POST` запити перед їх отриманням.

## Postman Flow
Щоб ознайомитися з налаштованим Postman Flow для цього застосунку, перейдіть за посиланням нижче. 
Спочатку потрібно надіслати запит на доступ:
[Postman Flow](https://web.postman.co/workspace/d698ba83-c9cc-422c-8321-81d789e7735c/flow/672a79fd4fd9677a7aed88c6)
> **Примітка**: Після отримання доступу ви зможете переглянути всі налаштування запитів та логіку потоку для зручного тестування ендпоінтів застосунку.

## Файл колекції Postman для тестування застосунку
Для зручного тестування ендпоінтів застосунку ви можете переглянути та завантажити файл колекції Postman за наступним посиланням:
[Колекція Postman](https://drive.google.com/drive/folders/1Ijz5un4t12L669Nbq8_ymM3p3Uu77Dr1?usp=sharing)
> **Примітка**: Після завантаження ви зможете імпортувати колекцію в Postman і використовувати готові запити для тестування всіх доступних ендпоінтів.
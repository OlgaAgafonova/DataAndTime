# Работа с датой и временем в JDK 8

## Популярные классы и их описание

| Class                         | Description|
|-------------------------------|------------|
| LocalDate                     | дата без времени суток, смещения и часового пояса |
| LocalTime                     | время без даты, смещения и часового пояса  |
| LocalDateTime                 | дата и время без смещения и часового пояса |
| Clock                         | доступ к instant, текущим дате и времени с использованием часового пояса |
| OffsetDate                    | дата со смещением (zB, +02:00), но без времени и часового пояса |
| OffsetTime                    | время со смещением (zB, +02:00), но без даты и часового пояса |
| OffsetDateTime                | дата и  время со смещением (zB, +02:00), но без часового пояса |
| ZonedDateTime                 | дата и  время со смещением и часовым поясом |
| ZoneOffset                    | время смещения от UTC |
| ZoneId                        | определение таких часовых поясов как "Австралия / Брисбен" |
| YearMonth                     | год и месяц |
| MonthDay                      | месяц и день |
| Year/MonthOfDay/DayOfWeek/... | классы важных полей |
| DateTimeFields                | хранит отображение пар поле-значение, еоторые могут быть недействительными |
| Calendrical                   | доступ к API низкого уровня |
| Period                        | Описание количества времени (zB, 2 месяца и 3 дня) |
| Duration                      | количество времени в наносекундах |
| Instant                       | точка во времени в наносекундах с 1 января 1970 г. |

### Получение текущей даты

* Способ 1:

```
LocalDate currentDate = LocalDate.now(); //2016-06-02
```

* Создание даты:

```
LocalDate dateOfBirth = LocalDate.of(2012, Month.MAY, 14); //2012-05-14
```

------------------------------
### Получение текущего времени

* Способ 1:

```
LocalTime time = LocalTime.now(); //14:51:04:668
```

* Создание времени:

```
LocalTime specificTime = LocalTime.of(12,20,25,40); //15:20:25:000000040
```

------------------------------
### Получение текущей даты и текущего времени

*  Способ 1:

```
LocalDateTime localDateTime = LocalDateTime.now(); //2016-06-02T13:00:51.899
```

* Способ 2:

```
Clock clock = Clock.systemDefaultZone();
LocalDateTime localDateTime = LocalDateTime.now(clock); //2016-06-02T13:00:51.900
```

* Способ 3:

```
ZoneId zoneId = ZoneId.systemDefault();
LocalDateTime localDateTime = LocalDateTime.now(zoneId); //2016-06-02T13:00:51.900
```

* Способ создания текущего времени и даты:

```
LocalDateTime localDateTime = LocalDateTime.of(Year.now().getValue(), Month.FEBRUARY, DayOfWeek.SATURDAY.getValue(), 1, 1, 1); //2016-02-06T01:01:01
```


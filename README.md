TR
Bu proje, çalışan yönetimi yapan basit bir Java tabanlı uygulamadır. Grafik kullanıcı arayüzü (GUI) ile kullanıcıların çalışan kayıtlarını görüntülemesine, eklemesine, güncellemesine ve silmesine olanak tanır.

Giriş Ekranı (Şirket Giriş Ekranı):
İlk resimde bir giriş ekranı yer alıyor. Bu ekranda iki alan mevcut:

Kullanıcı Adı
Parola
Bunların altında Giriş Yap düğmesi var. Bu ekran, sisteme erişim sağlamak için kullanıcıların kimlik doğrulaması yaptığı yer.

Çalışan Yönetim Ekranı (Şirket Çalışan Ekranı):
İkinci resim, çalışan bilgilerini yönetmek için kullanılan ana ekranı gösteriyor. Bu ekrandaki özellikler şunlardır:

En üstte bir arama çubuğu yer alıyor. Bu alan, çalışanları ada göre aramak veya filtrelemek için kullanılıyor.
Çalışan bilgileri alanları: Ad (Adı), Soyad (Soyadı), Departman (Bölüm) ve Maaş (Maaşı) alanları mevcut.
Üç ana işlem yapılabiliyor:
Yeni Çalışan Ekle: Yeni bir çalışan eklemek için kullanılıyor.
Çalışan Güncelle: Mevcut bir çalışanın bilgilerini güncellemek için kullanılıyor.
Çalışan Sil: Bir çalışanı silmek için kullanılıyor.
Bu işlemlerin altında, tüm çalışanların bilgilerini gösteren bir tablo bulunuyor. Bu tabloda şu sütunlar yer alıyor:

id: Çalışan kimlik numarası
ad: Çalışanın adı
soyad: Çalışanın soyadı
departman: Çalıştığı bölüm
maas: Aldığı maaş
Kod Açıklaması (CalısanIslemleri.java):
CalısanIslemleri sınıfı, çalışan yönetim sisteminin arka plan işlemlerini gerçekleştiren kısımdır. Kodun ana işlevleri şunlardır:

Veritabanı Bağlantısı: Sınıf, bir SQL veritabanına (muhtemelen MySQL gibi) bağlantı sağlar. Kodda Connection, PreparedStatement, Statement ve ResultSet gibi sınıfların dahil edilmesi bunu göstermektedir.

Çalışanları Getirme: calisanlariGetir() adlı metot, veritabanındaki çalışan kayıtlarını sorgular ve bunları ArrayList<Calisan> içerisine alır. Her çalışan için şu bilgiler elde edilir:

id: Çalışan kimlik numarası
ad: Çalışanın adı
soyad: Çalışanın soyadı
departman: Çalıştığı bölüm
maas: Aldığı maaş
Bu kayıtlar, muhtemelen çalışanları temsil eden özel bir Calisan sınıfında saklanıyor.

SQL Sorguları: Kod, çalışan verilerini veritabanından almak için SQL sorguları kullanıyor. Örneğin: Select * From calisanlar.

Bu sınıf, çalışanların eklenmesi, güncellenmesi ve silinmesi gibi işlemleri de gerçekleştirebilir; ancak şu anda yalnızca kodun ilk kısmını inceledim.

Ana Bileşenler:
Veritabanı İşlemleri: Uygulama, SQL tabanlı bir veritabanı ile iletişim kurarak çalışanlar için CRUD (Oluşturma, Okuma, Güncelleme, Silme) işlemlerini gerçekleştiriyor.
GUI Etkileşimi: Arayüzdeki düğmeler (Ekle, Güncelle, Sil), arka plandaki Java kodu ile çalışan yönetimini sağlıyor.
Java Swing (Muhtemel): GUI muhtemelen Java Swing kullanılarak oluşturulmuş. Bu GUI, çalışan verilerini yönetmek için Java backend ile etkileşimde bulunuyor.

EN
The Java project is related to managing employee records. Here's a breakdown of what the project does based on the Java code and the images you've provided:

General Description:
This project is a simple Java-based employee management system with a graphical user interface (GUI). It allows the user to:

Log into the system.
View, add, update, and delete employee records.
Login Screen (Sirket Giris Ekranı):
The first image shows a login screen with two fields:

Kullanıcı Adı (Username)
Parola (Password)
There's also a button labeled Giriş Yap (Login). This is the entry point to the system where users must authenticate themselves before accessing the employee management system.

Employee Management Screen (Sirket Calisan Ekranı):
The second image shows the main interface for managing employee information. The features include:

Search bar at the top to filter or search employees by name.
Fields for employee details: Ad (First Name), Soyad (Last Name), Departman (Department), and Maas (Salary).
Three main actions:
Yeni Çalışan Ekle (Add New Employee): Adds a new employee to the list.
Çalışan Güncelle (Update Employee): Updates the information of an existing employee.
Çalışan Sil (Delete Employee): Deletes an employee from the list.
Below these controls is a table that lists the employee details, including the following columns:

id: Employee ID
ad: First name
soyad: Last name
departman: Department
maas: Salary
Code Description (CalısanIslemleri.java):
The Java class CalısanIslemleri handles the backend operations of the employee management system. Here’s a summary of its key functionalities:

Database Connection: The class manages the connection to a database (likely a MySQL or similar SQL-based database), as shown by the imports of Connection, PreparedStatement, Statement, and ResultSet.

Retrieve Employees: The method calisanlariGetir() queries the database to retrieve all employee records and stores them in an ArrayList<Calisan>. It extracts the following details for each employee:

id
ad (first name)
soyad (last name)
departman (department)
maas (salary)
The employee records are stored in a custom Calisan class, which likely represents the employee entity.

SQL Queries: The code uses SQL queries like Select * From calisanlar to fetch employee data from the database.

The class seems to handle more functionality like inserting, updating, and deleting employees from the database, though I only examined the first portion of the code.

Key Components:
Database Operations: It communicates with an SQL database to perform CRUD (Create, Read, Update, Delete) operations for employee management.
GUI Interaction: Through buttons (Add, Update, Delete), the GUI is linked to the Java backend to manage employee records.
Java Swing (Assumed): The GUI is likely built using Java Swing based on the appearance of the interface. It interacts with the backend Java code to manage employee data.

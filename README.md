<h1 align="left">SauceDemo Task - Selenium Framework With Cucumber</h1>

###

<h3 align="left">Codes und Tests Erstellt von :</h3>

###

<p align="left">Seyit Ali Oran<br>QA Automation Engineer<br>seyitalioran05@gmail.com</p>

###

<h2 align="left">Erste Schritte</h2>

###

<p align="left">Um mit diesem Framework arbeiten zu können, benötigen Sie die folgende Software auf Ihrem System.<br>• Java 8 or later<br>• Maven 3 or later<br>• Chrome or Firefox or Edge Web Browser<br><br>1. öffnen Sie das Terminal oder die Eingabeaufforderung und navigieren Sie zum Stammverzeichnis des Projekts.<br><br>2. führen Sie den folgenden Befehl aus, um die erforderlichen Abhängigkeiten herunterzuladen:<br>- mvn clean install<br><br>3. führen Sie den folgenden Befehl aus, um die Tests zu starten:<br>- mvn verify<br><br>4. öffnen Sie das Projekt mit Intellij IDEA<br>- Gehen Sie zur Klasse CukesRunner innerhalb des Projekts.<br>- Klicken Sie auf Run button<br><br><br>Mit CukesRunner ausführen<br>- Gehe zu CukesRunner<br>- Fügen Sie einen Tag-Namen hinzu<br>- Klicken Sie auf den "Run" Button</p>

###

<h2 align="left">Details zu meinem Projekt:</h2>

###

<p align="left">- Ich habe mein Framework in der Programmiersprache Java entwickelt.<br>- Ich habe Maven als Build Automation Tool für dieses Framework verwendet.<br>- Ich habe Selenium (4.15.0), Cucumber und Junit verwendet, um meine Tests zu orchestrieren, und die Abhängigkeiten in der Datei pom.xml gespeichert.<br>- Für Assertions/Verifizierungen habe ich JUnit Assertions verwendet, um erwartete und tatsächliche Ergebnisse zu vergleichen.<br>- Ich habe eine Properties-Datei erstellt, um zugehörige Daten wie Browser und URL zu speichern.<br>- Ich habe das Page Object Model Design Pattern verwendet, um die Testwartung zu verbessern und Code-Duplizierung zu reduzieren. Dies ist einer der bekanntesten Selenium-Ansätze.<br>- Innerhalb des Seitenpakets habe ich Seitenklassen verwendet, um die Elemente, an denen ich gearbeitet habe, zu speichern und zu identifizieren.<br>- Ich benutzte die PageFactory Klasse und die initElements Methode, um sie zu initialisieren.<br>- Im Runners-Paket; in der CukesRunner-Klasse habe ich Glues verwendet, um Feature-Dateien mit Schrittdefinitionen zu verknüpfen.<br>- Ich habe das Report Plugin zu CukesRunner hinzugefügt, um Json und HTML Berichte zu generieren.<br>- Ich habe auch Tags für Tests verwendet, die ich in großen Mengen ausführen möchte.<br>- Das stepDefs-Paket ist der Ort, an dem sich meine eigentlichen Testskripte befinden.<br>- Innerhalb des stepDefs-Pakets habe ich die Hooks-Klasse als Pre- und Post-Test-Implementierungen verwendet.<br>- Ich habe eine Screenshot-Schnittstelle in der After-Methode der Hooks-Klasse hinzugefügt; wenn das Szenario fehlschlägt, wird ein Screenshot erstellt.<br>- Ich habe die Schritte meiner Szenarien in StepDef-Klassen definiert.<br>- Ich habe Utility-Klassen wie BrowserUtils, Driver und ConfigurationReader im Utilities-Paket gespeichert.<br>- In der Klasse Driver habe ich das Singleton Design Pattern verwendet, indem ich den Konstruktor der Klasse als privat deklariert habe, so dass niemand außerhalb der Klasse die Klasse instanziieren kann. Außerdem habe ich eine statische Methode mit Rückgabetyp als Objekt der Klasse deklariert, um zu prüfen, ob die Klasse schon einmal instanziiert wurde.<br>- Im Verzeichnis features, das sich unterhalb des Verzeichnisses resources befindet, habe ich Feature-Dateien erstellt.<br>- In diesen Feature-Dateien habe ich die Sprachen Cucumber und Gherkin verwendet, damit auch Nicht-Techniker verstehen können, was beim Testen passiert.<br>- Ich habe meine Feature-Dateien separat im Feature-Verzeichnis gespeichert, was die Wiederverwendbarkeit des Codes erleichtert.<br>- Ich habe meine Testfälle als Scenario in den Feature-Dateien erstellt.<br>- Mein Framework ist einfach zu warten, da ich die Elemente an einem zentralen Ort gespeichert habe. Wenn in der Anwendung Änderungen an den Elementen vorgenommen werden, weiß ich, wohin ich gehen und wie ich sie korrigieren muss, damit die Testskripte korrekt ausgeführt werden.</p>

###

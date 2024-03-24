Feature: Der Benutzer sollte sich anmelden und den Kauf abschließen können
  @wip
  Scenario: Anmeldung und End-to-End-Test
    Given Der Benutzer befindet sich auf der Anmeldeseite
    When Der Benutzer "standard_user" und "secret_sauce" eingibt
    Then Der Benutzer sollte  in der Lage sein, die Kopfzeile "Products" zu sehen
    And Der Benutzer fügt die Produkte "7.99" und "29.99" hinzu
    And Der Benutzer öffnet den Warenkorb
    And Der Benutzer klickt auf Zur Kasse gehen
    And Der Benutzer gibt die Daten "John" und "Wick" und "NW090312" ein
    Then Der Benutzer überprüft, dass der Preis "Total: $41.02" ist
    And Der Benutzer klickt auf die Schaltfläche Finish
    Then Der Benutzer sollte in der Lage sein, eine Bestätigungsnachricht wie "Thank you for your order!" zu sehen.


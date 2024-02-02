Feature: Gestion des informations clients
  Étant donné que nous sommes une entreprise de vente de pièces automobiles
  nous souhaitons informer nos clients des nouveaux arrivages de pièces. Cette information sera basée sur
  les données de la dernière voiture enregistrée par le client dans notre système.


  Scenario Outline: Obtenir les informations d'une voiture pour un client avec voiture
    Given un client avec le nom "<Nom>"
    And "<Nom>" possède une voiture avec matricule <Matricule> et marque "<Marque>"
    When je demande les informations de la voiture pour le client
    Then je devrais obtenir "<Resultat attendu>"

    Examples:
      | Nom      | Matricule | Marque   | Resultat attendu                                         |
      | John Doe | 123       | Toyota   | John Doe possède une voiture avec matricule 123 et marque Toyota |
      | Jane Doe | 456       | Honda    | Jane Doe possède une voiture avec matricule 456 et marque Honda  |

  Scenario Outline: Obtenir un message approprié pour un client sans voiture
    Given un client avec le nom "<Nom>"
    And "<Nom>" n'a pas de voiture
    When je demande les informations de la voiture pour le client
    Then je devrais obtenir "<Resultat attendu pour client sans voiture>"

    Examples:
      | Nom        | Resultat attendu pour client sans voiture |
      | Alice      | Alice n'a pas de voiture.             |
      | Bob        | Bob n'a pas de voiture.             |


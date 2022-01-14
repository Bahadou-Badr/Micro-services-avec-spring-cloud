## À propos de ce projet 🏁

Une application basée sur trois services métiers :

- Service des Clients (Customer-service)
- Service d'invetaire (Inventory-service)
- Service Facturation
- Service Externes : RapidAPI

L'orchestration des services se fait via les services techniques de Spring Cloud :

- Spring Cloud Gateway Service comme service proxy
- Registry Eureka Service comme annuaire d'enregistrement et de découverte des services de l'architecture
- Hystrix Circuit Breaker
- Hystrix DashBoard

## À propos de ce projet 🏁

#### Une application basée sur trois services métiers :

- Service des Clients (Customer-service)
- Service d'invetaire (Inventory-service)
- Service Facturation (Billing-service)
- Service d'Authentification en utilisant Spring Security et JWT :
  - Ce service permet de gérer : Les uttilisateurs - Les roles(USER,ADMIN,CUSTOMER_MANAGER,PRODUCT_MANAGER,BILLS_MANAGER) - Un utilisateur peut avoir plusieur roles et chaque role peut etre affecte a plusieur utilisateurs

#### L'orchestration des services se fait via les services techniques de Spring Cloud :

- Spring Cloud Gateway Service comme service proxy
- Registry Eureka Service comme annuaire d'enregistrement et de découverte des services de l'architecture
- Hystrix Circuit Breaker
- Hystrix DashBoard

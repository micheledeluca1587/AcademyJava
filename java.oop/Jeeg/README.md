## Polimorfismo
- Il polimorfismo indica la capaictà si un oggetto di assumere diverse forme.
- possibilità di richiamare su un oggetto un metodo che agisce in modo diverso in base all'oggetto su cui lo richiamo

JeegRobot
- un robot che può essere costruito in diverse forme
- posso costruire un robot che ha come arti superiori una volta un pugno, una volta una trivella, una volta un laser
- jeeg attacca sempre con gli arti superiori ma attacca in maniera diversa in baase al componente che ci monto su
ParteSuperiore -> attacca()


Fortnite
    - Player -> attaccare()
        - arma
            - pistola -> spara un colpo alla volta
            - mitra -> spara più colpi al secondo
            - lanciafiamme -> spara fiamme

new Player(pistola)
player.attacca() -> spara un colpo alla volta

new Player(mitra)
player.attacca() -> spara più colpi al secondo

new Player(lanciafiamme)
player.attacca() -> spara fiamme


new Jeeg(Laser)
jeeg.attacca() -> ti attacco con il laser

new Jeeg(arm)
jeeg.attacca() -> "Ti attacco con il braccio " sx o dx




Jeeg
    -> due arti superiori ( armdx, armsx ) -> attacco
    -> uan parte inferiore -> movimento


Documento
    - User -> geInfo()
    - BankAccount -> getSaldo() -> getListaMovimenti()


## DOWNCASTING
Laser laser = new Laser("Destro");
Arm laserDowncasted = (Arm) laser;
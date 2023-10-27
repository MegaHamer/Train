class Train (var passengers:Int = 0) {
    var marshrut:String=""
    var vagons:Array<Vagon> = arrayOf()
    var places = places()
    private fun places():Int{
        var sum = 0;
        for (i in vagons){
            sum+=i.countPlaces
        }
        return sum
    }
    fun addVagon (){
        var sum = 0;
        for (i in vagons){
            sum+=i.countPlaces
        }
        if (sum >= passengers){
           return
        }
        var newVagon = Vagon()
        var unique = true
        while(true){
            for (i in 0 until vagons.count()){
                if  (vagons[i].number == newVagon.number){
                    unique=false
                    newVagon=Vagon()
                    break
                }
                unique=true
            }
            if (unique){
                vagons+=newVagon
                places = places()
                break
            }
        }

    }
    fun createMarshrut(){
        val cites = arrayOf("Санкт-Петербург","Якутск","Новосибирск","Алтай","Иркутск",
            "Владивосток","Екатеринбург","Москва","Сочи","Краснодар","Нижний новгород",
            "Симферополь","Воронеж","Минск","Иваново","Брянск","Ростов-на-Дону","Ярославль")
        val start = cites.random()
        var end = cites.random()
        while(start==end){
            end=cites.random()
        }
        marshrut = start +" - "+ end
    }

    fun sendTrain(){
        println("Поезд ${this.marshrut},сотоящий из ${this.vagons.count()} вагонов отправлен")
    }
}
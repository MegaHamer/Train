fun main() {
        //1 создать маршрут
        var train1:Train = Train()
        train1.createMarshrut()
        println("Маршрут: "+train1.marshrut)
        //2 продать билеты
        val tickets = (5..201).random()
        println("Продано ${tickets} билетов")
        //3 сделать вагоны
        train1.passengers=tickets
        while (train1.passengers>train1.places){
            train1.addVagon()
        }
        println("Вагоны:")
        for (i in 0 until train1.vagons.count()){
            println("[${i+1}] номер вагона: ${train1.vagons[i].number} мест: ${train1.vagons[i].countPlaces}")
        }
        //4 отправить поезд
        train1.sendTrain()
}
class Vagon (var type:String = "passenger"){
    var number = (0..9999).random().toString().padStart(4,'0')
    var countPlaces = (5..25).random()
}
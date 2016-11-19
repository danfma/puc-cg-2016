package play09.engine

import javafx.geometry.Point2D

interface GameObject : Updatable {
    var position: Point2D
}
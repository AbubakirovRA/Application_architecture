package ModelElements;

import java.util.HashSet;
/* Для хранения точек используем коллекцию типа HashSet*/

public class Poligon {
    private HashSet<Point3D> points;

    public Poligon(HashSet<Point3D> points){
        this.points = points;
    }

    public HashSet<Point3D> getPoints(){
        return points;
    }
    public void addPoint(Point3D point){
        this.points.addAll(points);
    }
    public void delPoint(Point3D point){
        this.points.remove(point);
    }
}

/*HashSet — это коллекция в пространстве имен System.Collections.Generic. 
1. Это — неупорядоченная структура, элементы этой коллекции могут быть неупорядоченными — 
например 2, 14, 4, 55, 53 и т.д. 

2. Данная коллекция динамическая — автоматически увеличивается при добавлении новых элементов.

3. Самое главное свойство коллекции HashSet — в ней хранятся только уникальные элементы. 
Если в структуру данных попадает второй одинаковый элемент, он автоматически удаляется.

4. В коллекции HashSet можно хранить элементы только одного типа.

HashSet, представляет собой коллекцию на основе хэшей, поиск выполняется очень быстро. 
Содержит только значения.

В HashSet невозможна сортировка структуры данных — порядок элементов в этой коллекции не определен.
*/

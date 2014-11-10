import utils.Math

/**
 * Created by matank on 11/10/2014.
 */

toPrint = 'Hello-World!'
println toPrint

println 'another line'

count = [0, 1, 2, 3, 4, 5, 6, 7]

count.each{println it}

count.each{println Math.square(it)}

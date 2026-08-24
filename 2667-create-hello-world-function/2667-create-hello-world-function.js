/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        let hi = "Hello World";
        return hi;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
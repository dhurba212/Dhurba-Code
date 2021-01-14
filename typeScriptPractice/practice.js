"use strict";
exports.__esModule = true;
exports.Point = void 0;
var Point = /** @class */ (function () {
    function Point(_x, _y) {
        this._x = _x;
        this._y = _y;
    }
    Object.defineProperty(Point.prototype, "x", {
        get: function () {
            return this._x;
        },
        set: function (value) {
            if (value < 0) {
                throw new Error('value cannot be negative');
            }
            this._x = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Point.prototype, "y", {
        get: function () {
            return this._y;
        },
        set: function (value) {
            if (value < 0) {
                throw new Error('value cannot be negative');
            }
            this._y = value;
        },
        enumerable: false,
        configurable: true
    });
    Point.prototype.draw = function () {
        console.log("X is " + this._x + ", Y is " + this._y);
    };
    return Point;
}());
exports.Point = Point;

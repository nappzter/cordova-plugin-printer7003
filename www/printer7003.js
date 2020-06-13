var exec = require('cordova/exec');

/*exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'printer7003', 'coolMethod', [arg0]);
};*/

//write print methods

module.exports.print - function (arg0, success, error)
{

    exec(sucess, error, 'printer7003', 'print',[arg0])
}

module.exports.quitprint - function (arg0, success, error)
{

    exec(sucess, error, 'printer7003', 'quitprint',[arg0])
}

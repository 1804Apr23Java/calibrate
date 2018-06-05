(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error('Cannot find module "' + req + '".');
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./components/loginpage/loginpage.component */ "./src/app/components/loginpage/loginpage.component.ts");
/* harmony import */ var _components_userview_userview_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./components/userview/userview.component */ "./src/app/components/userview/userview.component.ts");
/* harmony import */ var _components_userview_my_libraries_userview_my_libraries_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./components/userview-my-libraries/userview-my-libraries.component */ "./src/app/components/userview-my-libraries/userview-my-libraries.component.ts");
/* harmony import */ var _components_userview_public_libraries_userview_public_libraries_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./components/userview-public-libraries/userview-public-libraries.component */ "./src/app/components/userview-public-libraries/userview-public-libraries.component.ts");
/* harmony import */ var _components_userview_pending_libraries_userview_pending_libraries_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./components/userview-pending-libraries/userview-pending-libraries.component */ "./src/app/components/userview-pending-libraries/userview-pending-libraries.component.ts");
/* harmony import */ var _components_take_a_quiz_take_a_quiz_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./components/take-a-quiz/take-a-quiz.component */ "./src/app/components/take-a-quiz/take-a-quiz.component.ts");
/* harmony import */ var _components_review_quizzes_review_quizzes_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./components/review-quizzes/review-quizzes.component */ "./src/app/components/review-quizzes/review-quizzes.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};









var appRoutes = [
    { path: 'login', component: _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_2__["LoginpageComponent"] },
    { path: 'user',
        component: _components_userview_userview_component__WEBPACK_IMPORTED_MODULE_3__["UserviewComponent"],
        children: [
            { path: 'mylibraries', component: _components_userview_my_libraries_userview_my_libraries_component__WEBPACK_IMPORTED_MODULE_4__["UserviewMyLibrariesComponent"] },
            { path: 'publiclibraries', component: _components_userview_public_libraries_userview_public_libraries_component__WEBPACK_IMPORTED_MODULE_5__["UserviewPublicLibrariesComponent"] },
            { path: 'pendinglibraries', component: _components_userview_pending_libraries_userview_pending_libraries_component__WEBPACK_IMPORTED_MODULE_6__["UserviewPendingLibrariesComponent"] },
            { path: 'take-a-quiz', component: _components_take_a_quiz_take_a_quiz_component__WEBPACK_IMPORTED_MODULE_7__["TakeAQuizComponent"] },
            { path: 'review-quizzes', component: _components_review_quizzes_review_quizzes_component__WEBPACK_IMPORTED_MODULE_8__["ReviewQuizzesComponent"] }
        ]
    },
    { path: '',
        redirectTo: '/login',
        pathMatch: 'full'
    }
    //  { path: '**', component: LoginpageComponent }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]],
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(appRoutes)]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\r\n    <router-outlet></router-outlet>\r\n</div>\r\n\r\n\r\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'app';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./components/loginpage/loginpage.component */ "./src/app/components/loginpage/loginpage.component.ts");
/* harmony import */ var _components_navbar_simple_navbar_simple_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./components/navbar-simple/navbar-simple.component */ "./src/app/components/navbar-simple/navbar-simple.component.ts");
/* harmony import */ var _components_sidebar_library_items_sidebar_library_items_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./components/sidebar-library-items/sidebar-library-items.component */ "./src/app/components/sidebar-library-items/sidebar-library-items.component.ts");
/* harmony import */ var _components_profile_profile_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./components/profile/profile.component */ "./src/app/components/profile/profile.component.ts");
/* harmony import */ var _components_userview_userview_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./components/userview/userview.component */ "./src/app/components/userview/userview.component.ts");
/* harmony import */ var _components_navbar_logged_navbar_logged_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./components/navbar-logged/navbar-logged.component */ "./src/app/components/navbar-logged/navbar-logged.component.ts");
/* harmony import */ var _components_sidebar_sidebar_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./components/sidebar/sidebar.component */ "./src/app/components/sidebar/sidebar.component.ts");
/* harmony import */ var _components_sidebar_quizzes_items_sidebar_quizzes_items_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./components/sidebar-quizzes-items/sidebar-quizzes-items.component */ "./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.ts");
/* harmony import */ var _components_display_lib_display_lib_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./components/display-lib/display-lib.component */ "./src/app/components/display-lib/display-lib.component.ts");
/* harmony import */ var _components_login_portal_login_portal_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./components/login-portal/login-portal.component */ "./src/app/components/login-portal/login-portal.component.ts");
/* harmony import */ var _components_userview_my_libraries_userview_my_libraries_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./components/userview-my-libraries/userview-my-libraries.component */ "./src/app/components/userview-my-libraries/userview-my-libraries.component.ts");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! .//app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _components_userview_public_libraries_userview_public_libraries_component__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(/*! ./components/userview-public-libraries/userview-public-libraries.component */ "./src/app/components/userview-public-libraries/userview-public-libraries.component.ts");
/* harmony import */ var _components_userview_pending_libraries_userview_pending_libraries_component__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(/*! ./components/userview-pending-libraries/userview-pending-libraries.component */ "./src/app/components/userview-pending-libraries/userview-pending-libraries.component.ts");
/* harmony import */ var _components_take_a_quiz_take_a_quiz_component__WEBPACK_IMPORTED_MODULE_18__ = __webpack_require__(/*! ./components/take-a-quiz/take-a-quiz.component */ "./src/app/components/take-a-quiz/take-a-quiz.component.ts");
/* harmony import */ var _components_review_quizzes_review_quizzes_component__WEBPACK_IMPORTED_MODULE_19__ = __webpack_require__(/*! ./components/review-quizzes/review-quizzes.component */ "./src/app/components/review-quizzes/review-quizzes.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};




















var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"],
                _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_4__["LoginpageComponent"],
                _components_navbar_simple_navbar_simple_component__WEBPACK_IMPORTED_MODULE_5__["NavbarSimpleComponent"],
                _components_sidebar_library_items_sidebar_library_items_component__WEBPACK_IMPORTED_MODULE_6__["SidebarLibraryItemsComponent"],
                _components_profile_profile_component__WEBPACK_IMPORTED_MODULE_7__["ProfileComponent"],
                _components_userview_userview_component__WEBPACK_IMPORTED_MODULE_8__["UserviewComponent"],
                _components_navbar_logged_navbar_logged_component__WEBPACK_IMPORTED_MODULE_9__["NavbarLoggedComponent"],
                _components_sidebar_sidebar_component__WEBPACK_IMPORTED_MODULE_10__["SidebarComponent"],
                _components_sidebar_quizzes_items_sidebar_quizzes_items_component__WEBPACK_IMPORTED_MODULE_11__["SidebarQuizzesItemsComponent"],
                _components_display_lib_display_lib_component__WEBPACK_IMPORTED_MODULE_12__["DisplayLibComponent"],
                _components_login_portal_login_portal_component__WEBPACK_IMPORTED_MODULE_13__["LoginPortalComponent"],
                _components_userview_my_libraries_userview_my_libraries_component__WEBPACK_IMPORTED_MODULE_14__["UserviewMyLibrariesComponent"],
                _components_userview_public_libraries_userview_public_libraries_component__WEBPACK_IMPORTED_MODULE_16__["UserviewPublicLibrariesComponent"],
                _components_userview_pending_libraries_userview_pending_libraries_component__WEBPACK_IMPORTED_MODULE_17__["UserviewPendingLibrariesComponent"],
                _components_take_a_quiz_take_a_quiz_component__WEBPACK_IMPORTED_MODULE_18__["TakeAQuizComponent"],
                _components_review_quizzes_review_quizzes_component__WEBPACK_IMPORTED_MODULE_19__["ReviewQuizzesComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormsModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_15__["AppRoutingModule"]
            ],
            providers: [],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/classes/library.ts":
/*!************************************!*\
  !*** ./src/app/classes/library.ts ***!
  \************************************/
/*! exports provided: Library */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Library", function() { return Library; });
var Library = /** @class */ (function () {
    function Library() {
    }
    return Library;
}());

var Status;
(function (Status) {
    Status[Status["PRIVATE"] = 0] = "PRIVATE";
    Status[Status["PENDING"] = 1] = "PENDING";
    Status[Status["PUBLIC"] = 2] = "PUBLIC";
})(Status || (Status = {}));


/***/ }),

/***/ "./src/app/components/display-lib/display-lib.component.css":
/*!******************************************************************!*\
  !*** ./src/app/components/display-lib/display-lib.component.css ***!
  \******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/display-lib/display-lib.component.html":
/*!*******************************************************************!*\
  !*** ./src/app/components/display-lib/display-lib.component.html ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n  Name: {{lib.name}} <br>\r\n  Status: {{lib.status}} <br>\r\n  Questions in Library: <br>\r\n  <ul class=\"displayLibParts\">\r\n    <li *ngFor=\"let q of lib.question\">\r\n      <span class=\"info\">{{q.value}}</span>\r\n    </li>\r\n  </ul>\r\n\r\n\r\n"

/***/ }),

/***/ "./src/app/components/display-lib/display-lib.component.ts":
/*!*****************************************************************!*\
  !*** ./src/app/components/display-lib/display-lib.component.ts ***!
  \*****************************************************************/
/*! exports provided: DisplayLibComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DisplayLibComponent", function() { return DisplayLibComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _classes_library__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../classes/library */ "./src/app/classes/library.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var DisplayLibComponent = /** @class */ (function () {
    function DisplayLibComponent() {
    }
    DisplayLibComponent.prototype.ngOnInit = function () {
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", _classes_library__WEBPACK_IMPORTED_MODULE_1__["Library"])
    ], DisplayLibComponent.prototype, "lib", void 0);
    DisplayLibComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-display-lib',
            template: __webpack_require__(/*! ./display-lib.component.html */ "./src/app/components/display-lib/display-lib.component.html"),
            styles: [__webpack_require__(/*! ./display-lib.component.css */ "./src/app/components/display-lib/display-lib.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], DisplayLibComponent);
    return DisplayLibComponent;
}());



/***/ }),

/***/ "./src/app/components/login-portal/login-portal.component.css":
/*!********************************************************************!*\
  !*** ./src/app/components/login-portal/login-portal.component.css ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "/* LOGIN PAGE */\r\n.login-portal{\r\n    width: 80%;\r\n    margin: auto;\r\n}\r\n.login-form-header{\r\n    text-align: center;\r\n    font-weight: bold;\r\n    font-size: 18px;\r\n    margin-top: 30px;\r\n}\r\n.login-label{\r\n    font-weight: bold;\r\n}\r\n.login-input{\r\n    border-radius: 15px;\r\n    border: 3px solid #F26925;\r\n    margin: 0 0 20px 0;\r\n    padding: 20px; \r\n    width: 100%;\r\n    height: 40px;\r\n}\r\n.login-input-password{\r\n    letter-spacing: 0.8em;\r\n}\r\n.login-input:focus {\r\n    outline: none;\r\n}\r\n#login-button{\r\n    display: inline-block;\r\n    border-radius: 25px;\r\n    margin-top: 20px;\r\n    border: 3px solid #F26925;\r\n    background: #F26925;\r\n    color: #fff;\r\n    width: 60%;\r\n    height: 50px;\r\n    transition: 0s;\r\n}\r\n#login-button:hover{\r\n    background: #fff;\r\n    color: #fab62b;\r\n}"

/***/ }),

/***/ "./src/app/components/login-portal/login-portal.component.html":
/*!*********************************************************************!*\
  !*** ./src/app/components/login-portal/login-portal.component.html ***!
  \*********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"login-portal\">\n  <h4 class=\"login-form-header\">Login with registered email</h4>\n  <label class=\"login-label\">Email</label><br>\n  <input type=\"text\" class=\"login-input\"><br>\n  <label class=\"login-label\">Password</label><br>\n  <input type=\"password\" class=\"login-input login-input-password\"><br>\n  <div class=\"text-center\">\n      <a routerLink=\"/loggedin\"> <!-- VERIFY instead of LOG IN -->\n        <button id=\"login-button\" class=\"btn center-block\" type=\"button\"><strong>LOG IN &gt;</strong></button>\n      </a>\n  </div>\n</div> "

/***/ }),

/***/ "./src/app/components/login-portal/login-portal.component.ts":
/*!*******************************************************************!*\
  !*** ./src/app/components/login-portal/login-portal.component.ts ***!
  \*******************************************************************/
/*! exports provided: LoginPortalComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginPortalComponent", function() { return LoginPortalComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var LoginPortalComponent = /** @class */ (function () {
    function LoginPortalComponent() {
    }
    LoginPortalComponent.prototype.ngOnInit = function () {
    };
    LoginPortalComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-login-portal',
            template: __webpack_require__(/*! ./login-portal.component.html */ "./src/app/components/login-portal/login-portal.component.html"),
            styles: [__webpack_require__(/*! ./login-portal.component.css */ "./src/app/components/login-portal/login-portal.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], LoginPortalComponent);
    return LoginPortalComponent;
}());



/***/ }),

/***/ "./src/app/components/loginpage/loginpage.component.css":
/*!**************************************************************!*\
  !*** ./src/app/components/loginpage/loginpage.component.css ***!
  \**************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/loginpage/loginpage.component.html":
/*!***************************************************************!*\
  !*** ./src/app/components/loginpage/loginpage.component.html ***!
  \***************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<app-navbar-simple></app-navbar-simple>\r\n\r\n<app-login-portal></app-login-portal>\r\n\r\n<!-- FOOTER -->"

/***/ }),

/***/ "./src/app/components/loginpage/loginpage.component.ts":
/*!*************************************************************!*\
  !*** ./src/app/components/loginpage/loginpage.component.ts ***!
  \*************************************************************/
/*! exports provided: LoginpageComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginpageComponent", function() { return LoginpageComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var LoginpageComponent = /** @class */ (function () {
    function LoginpageComponent() {
    }
    LoginpageComponent.prototype.ngOnInit = function () {
    };
    LoginpageComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-loginpage',
            template: __webpack_require__(/*! ./loginpage.component.html */ "./src/app/components/loginpage/loginpage.component.html"),
            styles: [__webpack_require__(/*! ./loginpage.component.css */ "./src/app/components/loginpage/loginpage.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], LoginpageComponent);
    return LoginpageComponent;
}());



/***/ }),

/***/ "./src/app/components/navbar-logged/navbar-logged.component.css":
/*!**********************************************************************!*\
  !*** ./src/app/components/navbar-logged/navbar-logged.component.css ***!
  \**********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/navbar-logged/navbar-logged.component.html":
/*!***********************************************************************!*\
  !*** ./src/app/components/navbar-logged/navbar-logged.component.html ***!
  \***********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n  <a class=\"navbar-brand\" href=\"#\"><img src=\"../assets/images/revature-navbar-logo.png\" style=\"width:100px;\"></a>\r\n  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n    <span class=\"navbar-toggler-icon\"></span>\r\n  </button>\r\n  <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\r\n    <div class=\"navbar-nav\">\r\n      <a class=\"nav-item nav-link\" href=\"#\">Dashboard</a> \r\n      <a class=\"nav-item nav-link\" href=\"#\">Curriculum</a>\r\n      <a class=\"nav-item nav-link\" href=\"#\">Courses</a>\r\n      <a class=\"nav-item nav-link\" href=\"#\">Calibrate</a>\r\n    </div>\r\n  </div>\r\n</nav>"

/***/ }),

/***/ "./src/app/components/navbar-logged/navbar-logged.component.ts":
/*!*********************************************************************!*\
  !*** ./src/app/components/navbar-logged/navbar-logged.component.ts ***!
  \*********************************************************************/
/*! exports provided: NavbarLoggedComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavbarLoggedComponent", function() { return NavbarLoggedComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var NavbarLoggedComponent = /** @class */ (function () {
    function NavbarLoggedComponent() {
    }
    NavbarLoggedComponent.prototype.ngOnInit = function () {
    };
    NavbarLoggedComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-navbar-logged',
            template: __webpack_require__(/*! ./navbar-logged.component.html */ "./src/app/components/navbar-logged/navbar-logged.component.html"),
            styles: [__webpack_require__(/*! ./navbar-logged.component.css */ "./src/app/components/navbar-logged/navbar-logged.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], NavbarLoggedComponent);
    return NavbarLoggedComponent;
}());



/***/ }),

/***/ "./src/app/components/navbar-simple/navbar-simple.component.css":
/*!**********************************************************************!*\
  !*** ./src/app/components/navbar-simple/navbar-simple.component.css ***!
  \**********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/navbar-simple/navbar-simple.component.html":
/*!***********************************************************************!*\
  !*** ./src/app/components/navbar-simple/navbar-simple.component.html ***!
  \***********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n  <a class=\"navbar-brand\" href=\"#\"><img src=\"/assets/images/revature-navbar-logo.png\" style=\"width:100px;\"></a>\r\n</nav>"

/***/ }),

/***/ "./src/app/components/navbar-simple/navbar-simple.component.ts":
/*!*********************************************************************!*\
  !*** ./src/app/components/navbar-simple/navbar-simple.component.ts ***!
  \*********************************************************************/
/*! exports provided: NavbarSimpleComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavbarSimpleComponent", function() { return NavbarSimpleComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var NavbarSimpleComponent = /** @class */ (function () {
    function NavbarSimpleComponent() {
    }
    NavbarSimpleComponent.prototype.ngOnInit = function () {
    };
    NavbarSimpleComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-navbar-simple',
            template: __webpack_require__(/*! ./navbar-simple.component.html */ "./src/app/components/navbar-simple/navbar-simple.component.html"),
            styles: [__webpack_require__(/*! ./navbar-simple.component.css */ "./src/app/components/navbar-simple/navbar-simple.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], NavbarSimpleComponent);
    return NavbarSimpleComponent;
}());



/***/ }),

/***/ "./src/app/components/profile/profile.component.css":
/*!**********************************************************!*\
  !*** ./src/app/components/profile/profile.component.css ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/profile/profile.component.html":
/*!***********************************************************!*\
  !*** ./src/app/components/profile/profile.component.html ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<h1>Account Profile</h1>\r\n\r\n<p>Welcome {{account.username}}</p>\r\n\r\n<form>\r\n\r\n    <div>\r\n      <label for=\"username\">Username: </label><br>\r\n      <input type=\"text\" [(ngModel)]=\"account.username\" name=\"username\">\r\n    </div>\r\n    <div>\r\n      <label for=\"password\">Password: </label><br>\r\n      <input type=\"password\" [(ngModel)]=\"account.password\" name=\"password\">\r\n    </div>\r\n    <div>\r\n      <label for=\"isAdmin\">Administrator: </label><br>\r\n      <input type=\"text\" [(ngModel)]=\"account.isAdmin\" name=\"isAdmin\">\r\n    </div>\r\n    <div>\r\n      <label for=\"email\">Email: </label><br>\r\n      <input type=\"text\" [(ngModel)]=\"account.email\" name=\"email\">\r\n    </div>\r\n\r\n</form>"

/***/ }),

/***/ "./src/app/components/profile/profile.component.ts":
/*!*********************************************************!*\
  !*** ./src/app/components/profile/profile.component.ts ***!
  \*********************************************************/
/*! exports provided: ProfileComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProfileComponent", function() { return ProfileComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_account_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../services/account.service */ "./src/app/services/account.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ProfileComponent = /** @class */ (function () {
    function ProfileComponent(accountService) {
        this.accountService = accountService;
    }
    ProfileComponent.prototype.getAccount = function () {
        this.account = this.accountService.getAccount();
    };
    ProfileComponent.prototype.ngOnInit = function () {
        console.log('profile ngOnInit ran...');
        //Call some service to get real data
        this.getAccount();
    };
    ProfileComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-profile',
            template: __webpack_require__(/*! ./profile.component.html */ "./src/app/components/profile/profile.component.html"),
            styles: [__webpack_require__(/*! ./profile.component.css */ "./src/app/components/profile/profile.component.css")]
        }),
        __metadata("design:paramtypes", [_services_account_service__WEBPACK_IMPORTED_MODULE_1__["AccountService"]])
    ], ProfileComponent);
    return ProfileComponent;
}());



/***/ }),

/***/ "./src/app/components/review-quizzes/review-quizzes.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/components/review-quizzes/review-quizzes.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- REVIEW PREVIOUS QUIZZES CONTENT -->\n\n<!-- Review Previous Quizzes Header Bar -->\n<div class=\"h4 user-view-header\">\n  <p>\n    <span class=\"fa fa-history quiz-header-icon\"></span>\n    <span>Review Previous Quizzes</span>\n  </p>\n</div>\n\n<!-- List of all Previous Quizzes -->\n<ul class=\"list-group\">\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <!-- *ngFor for each library found -->\n    <span>\n      <span class=\"h3\">Core Java, Angular 4</span>\n      <br>\n      <small>Taken on June 3, 2018 - 12:02 pm</small>\n      <br>\n      <small>Size: 30 questions</small>\n    </span>\n    <!-- Generate appropriate circle color with TypeScript -->\n    <span class=\"fa fa-circle fa-4x previous-quiz-score-circle\">\n      <span class=\"previous-quiz-score\">70%</span>\n    </span>\n  </li>\n\n  <!-- Repeated elements for prototype's sake, just need to *ngFor in Angular -->\n  <!-- also shows off desired backgrounds -->\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <span>\n      <span class=\"h3\">Spring Tools</span>\n      <br>\n      <small>Taken on June 2, 2018 - 11:44 pm</small>\n      <br>\n      <small>Size: 55 questions</small>\n    </span>\n    <span class=\"fa fa-circle fa-4x previous-quiz-score-circle\" style=\"color:red\">\n      <span class=\"previous-quiz-score\">33%</span>\n    </span>\n  </li>\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <span>\n      <span class=\"h3\">Hibernate, Spring Tools</span>\n      <br>\n      <small>Taken on June 1, 2018 - 9:11 am</small>\n      <br>\n      <small>Size: 41 questions</small>\n    </span>\n    <span class=\"fa fa-circle fa-4x previous-quiz-score-circle\" style=\"color: green\">\n      <span class=\"previous-quiz-score\">91%</span>\n    </span>\n  </li>\n</ul>\n\n<!-- END REVIEW PREVIOUS QUIZZES CONTENT -->"

/***/ }),

/***/ "./src/app/components/review-quizzes/review-quizzes.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/components/review-quizzes/review-quizzes.component.ts ***!
  \***********************************************************************/
/*! exports provided: ReviewQuizzesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ReviewQuizzesComponent", function() { return ReviewQuizzesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ReviewQuizzesComponent = /** @class */ (function () {
    function ReviewQuizzesComponent() {
    }
    ReviewQuizzesComponent.prototype.ngOnInit = function () {
    };
    ReviewQuizzesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-review-quizzes',
            template: __webpack_require__(/*! ./review-quizzes.component.html */ "./src/app/components/review-quizzes/review-quizzes.component.html"),
            styles: [__webpack_require__(/*! ../userview/userview.component.css */ "./src/app/components/userview/userview.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], ReviewQuizzesComponent);
    return ReviewQuizzesComponent;
}());



/***/ }),

/***/ "./src/app/components/sidebar-library-items/sidebar-library-items.component.css":
/*!**************************************************************************************!*\
  !*** ./src/app/components/sidebar-library-items/sidebar-library-items.component.css ***!
  \**************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/sidebar-library-items/sidebar-library-items.component.html":
/*!***************************************************************************************!*\
  !*** ./src/app/components/sidebar-library-items/sidebar-library-items.component.html ***!
  \***************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- DAVE'S OLD LOGIC -->\r\n<!-- <div>\r\n<h2>My Libraries</h2>\r\n\r\n<ul class=\"libraries\">\r\n  <li *ngFor=\"let lib of libraries\"\r\n    [class.selected]=\"lib === selectedLib\" (click)=\"onSelect(lib)\">\r\n    <span class=\"libs\">{{lib.name}} </span> <br> -->\r\n   <!-- <span class=\"libs\"> Status: {{lib.status}} </span> -->\r\n  <!-- </li>\r\n</ul>\r\n\r\n</div>\r\n\r\n<div>\r\n<app-display-lib [lib]=\"selectedLib\"></app-display-lib>\r\n</div> -->\r\n\r\n<ul class=\"list-group\">\r\n    <li routerLink=\"./mylibraries\" class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">My Libraries\r\n        <span class=\"badge badge-light badge-pill\">2</span>\r\n    </li>\r\n    <li routerLink=\"./publiclibraries\" class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">Public Libraries\r\n        <span class=\"badge badge-light badge-pill\">18</span>\r\n    </li>\r\n    <li routerLink=\"./pendinglibraries\" class=\"list-group-item list-group-item-info d-flex justify-content-between align-items-center list-as-link\">Pending Libraries\r\n        <span class=\"badge badge-light badge-pill\">6</span>\r\n    </li>                    \r\n</ul>"

/***/ }),

/***/ "./src/app/components/sidebar-library-items/sidebar-library-items.component.ts":
/*!*************************************************************************************!*\
  !*** ./src/app/components/sidebar-library-items/sidebar-library-items.component.ts ***!
  \*************************************************************************************/
/*! exports provided: SidebarLibraryItemsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SidebarLibraryItemsComponent", function() { return SidebarLibraryItemsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_library_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../services/library.service */ "./src/app/services/library.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var SidebarLibraryItemsComponent = /** @class */ (function () {
    function SidebarLibraryItemsComponent(libraryService) {
        this.libraryService = libraryService;
    }
    SidebarLibraryItemsComponent.prototype.onSelect = function (lib) {
        this.selectedLib = lib;
    };
    SidebarLibraryItemsComponent.prototype.getLibraries = function () {
        this.libraries = this.libraryService.getLibraries();
    };
    SidebarLibraryItemsComponent.prototype.ngOnInit = function () {
        //Call some service to get real data
        this.getLibraries();
    };
    SidebarLibraryItemsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-sidebar-library-items',
            template: __webpack_require__(/*! ./sidebar-library-items.component.html */ "./src/app/components/sidebar-library-items/sidebar-library-items.component.html"),
            styles: [__webpack_require__(/*! ./sidebar-library-items.component.css */ "./src/app/components/sidebar-library-items/sidebar-library-items.component.css")]
        }),
        __metadata("design:paramtypes", [_services_library_service__WEBPACK_IMPORTED_MODULE_1__["LibraryService"]])
    ], SidebarLibraryItemsComponent);
    return SidebarLibraryItemsComponent;
}());



/***/ }),

/***/ "./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.css":
/*!**************************************************************************************!*\
  !*** ./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.css ***!
  \**************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.html":
/*!***************************************************************************************!*\
  !*** ./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.html ***!
  \***************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- Quiz Tab Content -->\r\n<ul class=\"list-group\">\r\n    <li routerLink=\"./take-a-quiz\" class=\"list-group-item list-group-item-success align-items-center list-as-link\">\r\n        <strong>Take a Quiz</strong>\r\n    </li>\r\n    <li routerLink=\"./review-quizzes\" class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">Review Previous Quizzes\r\n        <span class=\"badge badge-light badge-pill\">15</span>\r\n    </li>\r\n</ul>"

/***/ }),

/***/ "./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.ts":
/*!*************************************************************************************!*\
  !*** ./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.ts ***!
  \*************************************************************************************/
/*! exports provided: SidebarQuizzesItemsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SidebarQuizzesItemsComponent", function() { return SidebarQuizzesItemsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var SidebarQuizzesItemsComponent = /** @class */ (function () {
    function SidebarQuizzesItemsComponent() {
    }
    SidebarQuizzesItemsComponent.prototype.ngOnInit = function () {
    };
    SidebarQuizzesItemsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-sidebar-quizzes-items',
            template: __webpack_require__(/*! ./sidebar-quizzes-items.component.html */ "./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.html"),
            styles: [__webpack_require__(/*! ./sidebar-quizzes-items.component.css */ "./src/app/components/sidebar-quizzes-items/sidebar-quizzes-items.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], SidebarQuizzesItemsComponent);
    return SidebarQuizzesItemsComponent;
}());



/***/ }),

/***/ "./src/app/components/sidebar/sidebar.component.css":
/*!**********************************************************!*\
  !*** ./src/app/components/sidebar/sidebar.component.css ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".sidebar {\r\n    border:1px solid black;\r\n}"

/***/ }),

/***/ "./src/app/components/sidebar/sidebar.component.html":
/*!***********************************************************!*\
  !*** ./src/app/components/sidebar/sidebar.component.html ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- SIDEBAR TABS -->\r\n<ul class=\"nav nav-tabs\">\r\n    <li class=\"nav-item sidebar-tab\">\r\n        <a class=\"nav-link\" (click)=\"showQuizzes()\">\r\n            <span class=\"fa fa-graduation-cap\"></span> Quizzes\r\n        </a>\r\n    </li>\r\n    <li class=\"nav-item sidebar-tab\">\r\n        <a class=\"nav-link\" (click)=\"showLibraries()\">\r\n            <span class=\"fa fa-question-circle\"></span> Libraries\r\n        </a>\r\n    </li>\r\n</ul>\r\n\r\n<!-- SIDEBAR CONTENT -->\r\n<!-- Will be generated by which tab is selected -->\r\n\r\n<div *ngIf=\"sidebarToggle\">\r\n    <app-sidebar-library-items></app-sidebar-library-items>\r\n</div>\r\n<div *ngIf=\"!sidebarToggle\">\r\n    <app-sidebar-quizzes-items></app-sidebar-quizzes-items>\r\n</div>"

/***/ }),

/***/ "./src/app/components/sidebar/sidebar.component.ts":
/*!*********************************************************!*\
  !*** ./src/app/components/sidebar/sidebar.component.ts ***!
  \*********************************************************/
/*! exports provided: SidebarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SidebarComponent", function() { return SidebarComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var SidebarComponent = /** @class */ (function () {
    function SidebarComponent() {
    }
    SidebarComponent.prototype.ngOnInit = function () {
        this.sidebarToggle = false;
    };
    SidebarComponent.prototype.showLibraries = function () {
        this.sidebarToggle = true;
    };
    SidebarComponent.prototype.showQuizzes = function () {
        this.sidebarToggle = false;
    };
    SidebarComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-sidebar',
            template: __webpack_require__(/*! ./sidebar.component.html */ "./src/app/components/sidebar/sidebar.component.html"),
            styles: [__webpack_require__(/*! ./sidebar.component.css */ "./src/app/components/sidebar/sidebar.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], SidebarComponent);
    return SidebarComponent;
}());



/***/ }),

/***/ "./src/app/components/take-a-quiz/take-a-quiz.component.html":
/*!*******************************************************************!*\
  !*** ./src/app/components/take-a-quiz/take-a-quiz.component.html ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- TAKE A QUIZ CONTENT -->\n<!-- Will probably turn into form -->\n\n<!-- Take a Quiz Header Bar -->\n<div class=\"h4 user-view-header\">\n  <p>\n    <span class=\"fa fa-tasks quiz-header-icon\"></span>\n    <span>Take a Quiz</span>\n  </p>\n</div>\n\n<!-- Library Selector -->\n<ul class=\"list-group\">\n  <li class=\"list-group-item\">\n    <div class=\"selected-libraries-header-text\">\n      <span>Libraries to Generate Quiz</span>\n    </div>\n  </li>\n  <li class=\"list-group-item d-flex justify-content-between align-items-center\">\n    <span>\n      <span class=\"h3\">Core Java</span>\n      <br>\n      <small>Author: Emily Higgins</small>\n      <br>\n      <small>Size: 83 questions</small>\n    </span>\n    <span class=\"fa fa-times fa-2x red-x-icon\"></span>\n  </li>\n  <li class=\"list-group-item list-group-item-success d-flex justify-content-between align-items-center\">\n    <strong>Add a Library</strong>\n    <span class=\"fa fa-plus-square fa-2x add-library-plus-icon\"></span>\n  </li>\n</ul>\n\n<!-- Number of Questions Selector -->\n<li class=\"list-group-item d-flex justify-content-between align-items-center mt-3\">\n  <span>\n    <span class=\"h4\">Number of Questions</span>\n    <br>\n    <small>Max questions: 83</small>\n  </span>\n  <span>\n    <input type=\"number\" class=\"number-of-questions-input\">\n  </span>\n</li>\n\n<!-- Additional Parameter Checkbox Selectors -->\n<li class=\"list-group-item d-flex justify-content-between align-items-center mt-3 additional-quiz-parameter\">Use Hardest Questions\n  <span>\n    <input type=\"checkbox\" class=\"quiz-parameter-checkbox\">\n  </span>\n</li>\n<li class=\"list-group-item d-flex justify-content-between align-items-center mt-3 additional-quiz-parameter\">Use Most Missed Questions\n  <span>\n    <input type=\"checkbox\" class=\"quiz-parameter-checkbox\">\n  </span>\n</li>\n\n<!-- Start Quiz Button -->\n<div class=\"text-center\">\n  <button id=\"start-quiz-button\" class=\"btn center-block\" type=\"button\">\n    <strong>Start Quiz!</strong>\n  </button>\n</div>\n\n<!-- END TAKE A QUIZ CONTENT-->"

/***/ }),

/***/ "./src/app/components/take-a-quiz/take-a-quiz.component.ts":
/*!*****************************************************************!*\
  !*** ./src/app/components/take-a-quiz/take-a-quiz.component.ts ***!
  \*****************************************************************/
/*! exports provided: TakeAQuizComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TakeAQuizComponent", function() { return TakeAQuizComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var TakeAQuizComponent = /** @class */ (function () {
    function TakeAQuizComponent() {
    }
    TakeAQuizComponent.prototype.ngOnInit = function () {
    };
    TakeAQuizComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-take-a-quiz',
            template: __webpack_require__(/*! ./take-a-quiz.component.html */ "./src/app/components/take-a-quiz/take-a-quiz.component.html"),
            styles: [__webpack_require__(/*! ../userview/userview.component.css */ "./src/app/components/userview/userview.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], TakeAQuizComponent);
    return TakeAQuizComponent;
}());



/***/ }),

/***/ "./src/app/components/userview-my-libraries/userview-my-libraries.component.html":
/*!***************************************************************************************!*\
  !*** ./src/app/components/userview-my-libraries/userview-my-libraries.component.html ***!
  \***************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- MY LIBRARIES CONTENT -->\n\n<div class=\"h4 user-view-header\">\n  <p>\n    <span class=\"fa fa-book quiz-header-icon\"></span>\n    <span>My Libraries</span>\n  </p>\n</div>\n<ul class=\"list-group\">\n  <!-- *ngFor for each library found -->\n  <li class=\"list-group-item d-flex justify-content-between align-items-center\">\n    <span>\n      <span class=\"h3\">PL/SQL - Stored Procedures</span>\n      <br>\n      <small>Size: 30 questions</small>\n    </span>\n    <span>\n      <span class=\"fa fa-edit fa-2x yellow-edit-icon\"></span>\n      <span class=\"fa fa-times fa-2x red-x-icon ml-3\"></span>\n    </span>\n  </li>\n\n  <!-- repetitive libraries for prototype's sake -->\n  <li class=\"list-group-item d-flex justify-content-between align-items-center\">\n    <span>\n      <span class=\"h3\">Microservices</span>\n      <br>\n      <small>Size: 51 questions</small>\n    </span>\n    <span>\n      <span class=\"fa fa-edit fa-2x yellow-edit-icon\"></span>\n      <span class=\"fa fa-times fa-2x red-x-icon ml-3\"></span>\n    </span>\n  </li>\n  <li class=\"list-group-item d-flex justify-content-between align-items-center\">\n    <span>\n      <span class=\"h3\">Hibernate</span>\n      <br>\n      <small>Size: 39 questions</small>\n    </span>\n    <span>\n      <span class=\"fa fa-edit fa-2x yellow-edit-icon\"></span>\n      <span class=\"fa fa-times fa-2x red-x-icon ml-3\"></span>\n    </span>\n  </li>\n</ul>\n<!-- END MY LIBRARIES CONTENT -->"

/***/ }),

/***/ "./src/app/components/userview-my-libraries/userview-my-libraries.component.ts":
/*!*************************************************************************************!*\
  !*** ./src/app/components/userview-my-libraries/userview-my-libraries.component.ts ***!
  \*************************************************************************************/
/*! exports provided: UserviewMyLibrariesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserviewMyLibrariesComponent", function() { return UserviewMyLibrariesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var UserviewMyLibrariesComponent = /** @class */ (function () {
    function UserviewMyLibrariesComponent() {
    }
    UserviewMyLibrariesComponent.prototype.ngOnInit = function () {
    };
    UserviewMyLibrariesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-userview-my-libraries',
            template: __webpack_require__(/*! ./userview-my-libraries.component.html */ "./src/app/components/userview-my-libraries/userview-my-libraries.component.html"),
            styles: [__webpack_require__(/*! ../userview/userview.component.css */ "./src/app/components/userview/userview.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], UserviewMyLibrariesComponent);
    return UserviewMyLibrariesComponent;
}());



/***/ }),

/***/ "./src/app/components/userview-pending-libraries/userview-pending-libraries.component.html":
/*!*************************************************************************************************!*\
  !*** ./src/app/components/userview-pending-libraries/userview-pending-libraries.component.html ***!
  \*************************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- PENDING LIBRARIES CONTENT -->\n\n<div class=\"h4 user-view-header\">\n  <p>\n    <span class=\"fa fa-book quiz-header-icon\"></span>\n    <span>Pending Libraries</span>\n  </p>\n</div>\n<ul class=\"list-group\">\n  <!-- *ngFor for each library found -->\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <span>\n      <span class=\"h3\">PL/SQL - Stored Procedures</span>\n      <br>\n      <small>Size: 30 questions</small>\n    </span>\n    <span>\n      <span class=\"fa fa-times fa-2x red-x-icon mr-3\"></span>\n      <span class=\"fa fa-check fa-2x green-check-icon\"></span>\n    </span>\n  </li>\n\n  <!-- repetitive libraries for prototype's sake -->\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <span>\n      <span class=\"h3\">Microservices</span>\n      <br>\n      <small>Size: 51 questions</small>\n    </span>\n    <span>\n      <span class=\"fa fa-times fa-2x red-x-icon mr-3\"></span>\n      <span class=\"fa fa-check fa-2x green-check-icon\"></span>\n    </span>\n  </li>\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <span>\n      <span class=\"h3\">Hibernate</span>\n      <br>\n      <small>Size: 39 questions</small>\n    </span>\n    <span>\n      <span class=\"fa fa-times fa-2x red-x-icon mr-3\"></span>\n      <span class=\"fa fa-check fa-2x green-check-icon\"></span>\n    </span>\n  </li>\n</ul>\n\n<!-- END PENDING LIBRARIES CONTENT -->"

/***/ }),

/***/ "./src/app/components/userview-pending-libraries/userview-pending-libraries.component.ts":
/*!***********************************************************************************************!*\
  !*** ./src/app/components/userview-pending-libraries/userview-pending-libraries.component.ts ***!
  \***********************************************************************************************/
/*! exports provided: UserviewPendingLibrariesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserviewPendingLibrariesComponent", function() { return UserviewPendingLibrariesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var UserviewPendingLibrariesComponent = /** @class */ (function () {
    function UserviewPendingLibrariesComponent() {
    }
    UserviewPendingLibrariesComponent.prototype.ngOnInit = function () {
    };
    UserviewPendingLibrariesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-userview-pending-libraries',
            template: __webpack_require__(/*! ./userview-pending-libraries.component.html */ "./src/app/components/userview-pending-libraries/userview-pending-libraries.component.html"),
            styles: [__webpack_require__(/*! ../userview/userview.component.css */ "./src/app/components/userview/userview.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], UserviewPendingLibrariesComponent);
    return UserviewPendingLibrariesComponent;
}());



/***/ }),

/***/ "./src/app/components/userview-public-libraries/userview-public-libraries.component.html":
/*!***********************************************************************************************!*\
  !*** ./src/app/components/userview-public-libraries/userview-public-libraries.component.html ***!
  \***********************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- PUBLIC LIBRARIES CONTENT -->\n\n<div class=\"h4 user-view-header\">\n  <p>\n    <span class=\"fa fa-book quiz-header-icon\"></span>\n    <span>Public Libraries</span>\n  </p>\n</div>\n<ul class=\"list-group\">\n  <!-- *ngFor for each library found -->\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <span>\n      <span class=\"h3\">HTML/CSS</span>\n      <br>\n      <small>Author: Team JIT</small>\n      <br>\n      <small>Size: 60 questions</small>\n    </span>\n  </li>\n\n  <!-- repetitive libraries for prototype's sake -->\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <span>\n      <span class=\"h3\">Core Java</span>\n      <br>\n      <small>Author: Emily Higgins</small>\n      <br>\n      <small>Size: 83 questions</small>\n    </span>\n  </li>\n  <li class=\"list-group-item d-flex justify-content-between align-items-center list-as-link\">\n    <span>\n      <span class=\"h3\">Spring MVC</span>\n      <br>\n      <small>Author: Team Error</small>\n      <br>\n      <small>Size: 23 questions</small>\n    </span>\n  </li>\n</ul>\n\n<!-- END PUBLIC LIBRARIES CONTENT -->"

/***/ }),

/***/ "./src/app/components/userview-public-libraries/userview-public-libraries.component.ts":
/*!*********************************************************************************************!*\
  !*** ./src/app/components/userview-public-libraries/userview-public-libraries.component.ts ***!
  \*********************************************************************************************/
/*! exports provided: UserviewPublicLibrariesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserviewPublicLibrariesComponent", function() { return UserviewPublicLibrariesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var UserviewPublicLibrariesComponent = /** @class */ (function () {
    function UserviewPublicLibrariesComponent() {
    }
    UserviewPublicLibrariesComponent.prototype.ngOnInit = function () {
    };
    UserviewPublicLibrariesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-userview-public-libraries',
            template: __webpack_require__(/*! ./userview-public-libraries.component.html */ "./src/app/components/userview-public-libraries/userview-public-libraries.component.html"),
            styles: [__webpack_require__(/*! ../userview/userview.component.css */ "./src/app/components/userview/userview.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], UserviewPublicLibrariesComponent);
    return UserviewPublicLibrariesComponent;
}());



/***/ }),

/***/ "./src/app/components/userview/userview.component.css":
/*!************************************************************!*\
  !*** ./src/app/components/userview/userview.component.css ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "/* MAIN CONTENT VIEW */\r\n.user-view-header{\r\n    position: relative;\r\n    text-align: center;\r\n    font-weight: bold;\r\n    border: 1px solid #aaa;\r\n    background-color: #F26925;\r\n    color: white;\r\n    height: 70px;\r\n}\r\n.quiz-header p{\r\n    position: absolute;\r\n    top: 50%;\r\n    left: 50%;\r\n    -webkit-transform: translate(-50%, -50%);\r\n            transform: translate(-50%, -50%);\r\n}\r\n.quiz-header-icon {\r\n    padding: 22px;\r\n}\r\n.red-x-icon{\r\n    color: red;\r\n}\r\n.selected-libraries-header-text{\r\n    position: relative;\r\n    text-align: center;\r\n    font-size: 20px;\r\n    font-weight: bold;\r\n}\r\n#start-quiz-button {\r\n    position: relative;\r\n    text-align: center;\r\n    font-weight: bold;\r\n    border: 1px solid #aaa;\r\n    color: white;\r\n    height: 70px;\r\n}\r\n.start-quiz-button p{\r\n    position: absolute;\r\n    top: 50%;\r\n    left: 50%;\r\n    -webkit-transform: translate(-50%, -50%);\r\n            transform: translate(-50%, -50%);\r\n}\r\n.number-of-questions-input{\r\n    border-radius: 15px;\r\n    border: 3px solid #aaa;\r\n    padding: 20px; \r\n    width: 100%;\r\n    height: 40px;\r\n}\r\n.number-of-questions-input:focus{\r\n    outline: none;\r\n}\r\n#start-quiz-button{\r\n    display: inline-block;\r\n    border-radius: 25px;\r\n    margin-top: 20px;\r\n    border: 3px solid #007BFF;\r\n    background: #007BFF;\r\n    color: #fff;\r\n    width: 60%;\r\n    height: 50px;\r\n    transition: 0s;\r\n}\r\n#start-quiz-button:hover{\r\n    background: #fff;\r\n    color: #007BFF;\r\n}\r\ninput[type=checkbox] {\r\n    -webkit-transform: scale(2.0);\r\n            transform: scale(2.0);\r\n}\r\ninput[type=checkbox] {\r\n    outline: none;\r\n}\r\n.previous-quiz-score-circle{\r\n    position:relative;\r\n    z-index: 0;\r\n}\r\n.previous-quiz-score{\r\n    color: white;\r\n    font-size: .35em;\r\n    position:absolute;\r\n    top: 50%;\r\n    left: 50%;\r\n    -webkit-transform: translate(-50%, -50%);\r\n            transform: translate(-50%, -50%);\r\n    z-index:1;\r\n}\r\n.yellow-edit-icon{\r\n    color:darkgoldenrod;\r\n}\r\n.green-check-icon{\r\n    color:green;\r\n}"

/***/ }),

/***/ "./src/app/components/userview/userview.component.html":
/*!*************************************************************!*\
  !*** ./src/app/components/userview/userview.component.html ***!
  \*************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<app-navbar-logged></app-navbar-logged>\r\n\r\n<div style=\"margin-bottom: 30px\"></div>\r\n<!-- USER PAGE -->\r\n<div class=\"row\">\r\n\r\n    <!-- TABBABLE SIDEBAR -->\r\n    <div class=\"col-md-4\">\r\n        <app-sidebar></app-sidebar>\r\n    </div>\r\n\r\n    <!-- USER MAIN CONTENT VIEW -->\r\n    <div class=\"col-md-8 user-main-content\">\r\n        <router-outlet></router-outlet>\r\n    </div>\r\n</div>"

/***/ }),

/***/ "./src/app/components/userview/userview.component.ts":
/*!***********************************************************!*\
  !*** ./src/app/components/userview/userview.component.ts ***!
  \***********************************************************/
/*! exports provided: UserviewComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserviewComponent", function() { return UserviewComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var UserviewComponent = /** @class */ (function () {
    function UserviewComponent() {
    }
    UserviewComponent.prototype.ngOnInit = function () {
    };
    UserviewComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-userview',
            template: __webpack_require__(/*! ./userview.component.html */ "./src/app/components/userview/userview.component.html"),
            styles: [__webpack_require__(/*! ./userview.component.css */ "./src/app/components/userview/userview.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], UserviewComponent);
    return UserviewComponent;
}());



/***/ }),

/***/ "./src/app/mock-account.ts":
/*!*********************************!*\
  !*** ./src/app/mock-account.ts ***!
  \*********************************/
/*! exports provided: ACCOUNT */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ACCOUNT", function() { return ACCOUNT; });
var ACCOUNT = {
    accountId: 1,
    username: 'DaveB',
    password: 'chunli',
    email: 'dave@gmail.com',
    isAdmin: false
};


/***/ }),

/***/ "./src/app/mock-libraries.ts":
/*!***********************************!*\
  !*** ./src/app/mock-libraries.ts ***!
  \***********************************/
/*! exports provided: LIBS */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LIBS", function() { return LIBS; });
var LIBS = [
    { accountId: 1, libraryId: 1, name: 'Core Java', status: 0, question: [
            { questionId: 1, difficulty: 5, value: "What is OOP?", libraryId: 1, answers: [] = [
                    { answerId: 1, isCorrect: false, value: "Ranch dressing", questionId: 1, isSelected: false },
                    { answerId: 2, isCorrect: true, value: "Object Oriented Programming", questionId: 1, isSelected: false }
                ] },
            { questionId: 2, difficulty: 2, value: "Is Java a OOP language?", libraryId: 1, answers: [] = [
                    { answerId: 3, isCorrect: true, value: "Yes.", questionId: 2, isSelected: false },
                    { answerId: 4, isCorrect: false, value: "No.", questionId: 2, isSelected: false }
                ] }
        ] },
    { accountId: 1, libraryId: 2, name: 'Angular', status: 1, question: [
            { questionId: 5, difficulty: 5, value: "What is Angular?", libraryId: 2, answers: [] = [
                    { answerId: 12, isCorrect: false, value: "Italian dressing", questionId: 5, isSelected: false },
                    { answerId: 13, isCorrect: true, value: "A bunch of Javascript", questionId: 5, isSelected: false }
                ] }
        ] },
    { accountId: 1, libraryId: 3, name: 'Servlets', status: 2, question: [
            { questionId: 9, difficulty: 5, value: "What are Servlets?", libraryId: 2, answers: [] = [
                    { answerId: 21, isCorrect: true, value: "Request Handlers", questionId: 9, isSelected: false },
                    { answerId: 22, isCorrect: false, value: "Nobody knows.", questionId: 9, isSelected: false }
                ] }
        ] }
];
/*
,
{ accountId: 1, libraryId: 3, name: 'Servlets', question: [], status: 2 },
{ accountId: 1, libraryId: 4, name: 'SQL', question: [], status: 0 },
{ accountId: 1, libraryId: 5, name: 'HTML', question: [], status: 0 },
*/


/***/ }),

/***/ "./src/app/services/account.service.ts":
/*!*********************************************!*\
  !*** ./src/app/services/account.service.ts ***!
  \*********************************************/
/*! exports provided: AccountService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AccountService", function() { return AccountService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _mock_account__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../mock-account */ "./src/app/mock-account.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AccountService = /** @class */ (function () {
    function AccountService() {
    }
    AccountService.prototype.getAccount = function () {
        //http request plz
        return _mock_account__WEBPACK_IMPORTED_MODULE_1__["ACCOUNT"];
    };
    AccountService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [])
    ], AccountService);
    return AccountService;
}());



/***/ }),

/***/ "./src/app/services/library.service.ts":
/*!*********************************************!*\
  !*** ./src/app/services/library.service.ts ***!
  \*********************************************/
/*! exports provided: LibraryService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LibraryService", function() { return LibraryService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _mock_libraries__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../mock-libraries */ "./src/app/mock-libraries.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var LibraryService = /** @class */ (function () {
    function LibraryService() {
    }
    LibraryService.prototype.getLibraries = function () {
        //http request plz
        return _mock_libraries__WEBPACK_IMPORTED_MODULE_1__["LIBS"];
    };
    LibraryService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [])
    ], LibraryService);
    return LibraryService;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * In development mode, to ignore zone related error stack frames such as
 * `zone.run`, `zoneDelegate.invokeTask` for easier debugging, you can
 * import the following file, but please comment it out in production mode
 * because it will have performance impact when throw error
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\William\Dev\RevatureEnv\gitrepos\calibrate\calibrate\calibrate-angular\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map
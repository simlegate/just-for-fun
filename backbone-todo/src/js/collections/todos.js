var app = app || {};

(function() {
  'use strict';

  app.Todos = Backbone.Collection.extend({

    model: app.Todo,

    url: '/todos'

  })

  app.todos = new app.Todos();
})();

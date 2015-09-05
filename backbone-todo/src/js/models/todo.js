var app = app || {};

(function () {
  'use strict';

  app.Todo = Backbone.Model.extend({
    // urlRoot: '/todos',

    defaults: {
      title: "",
      completed: false
    },

    idAttribute: 'id',

    toggle: function() {
      this.save({
        completed: !this.get('completed')
      })
    }
  });

})();

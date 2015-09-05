var app = app || {};

(function ($) {
  'use strict';

  app.TodoView = Backbone.View.extend({

    tagName:  'li',
    template: _.template($('#item-template').html()),

    events: {
      'click .toggle': 'toggleCompleted',
      'click .destroy': 'clear'
    },

    initialize: function() {
      this.listenTo(this.model, "destroy", this.remove)
    },

    toggleCompleted: function() {
      this.model.toggle();
    },

    render: function() {
      this.$el.html(this.template(this.model.toJSON()));
      this.$el.toggleClass('completed', this.model.get('completed'));
      this.toggleVisible();
      this.$input = this.$('.edit');
      return this;
    },

    toggleVisible: function () {
      this.$el.toggleClass('hidden', this.isHidden());
    },

    isHidden: function () {
      return this.model.get('completed') ?
        app.TodoFilter === 'active' :
        app.TodoFilter === 'completed';
    },

    clear: function() {
      this.model.destroy();
    }
  })

})(jQuery)
